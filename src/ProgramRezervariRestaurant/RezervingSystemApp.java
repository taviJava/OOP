package ProgramRezervariRestaurant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RezervingSystemApp {
    List<Restaurant> listaRestaurante = new ArrayList<>();

    public RezervingSystemApp() {
        this.listaRestaurante = listaRestaurante;
    }

    public void Meniu(){
        Scanner input=new Scanner(System.in);
        System.out.println("Meniu \n Apasati:  'on' pentru a face o rezervare sau pentru a adauga un restaurant in lista de rezervari \n Apasati: 'exit' pentru a iesi din program ");
        String a=input.nextLine();
        while (a.equals("on")){
            System.out.println("Apasa: '1' pentru a adauga un restaurant in lista\n Apasa '2' pentru a face o rezervare \n Apasa '3' pentru vedea rezervarile in functie de restaurant\n ATENTIE: DACA N-AI ADAUGAT " +
                    "RESTAURANTE, NU POTI FACE O REZERVARE IAR DACA N-AI FACUT REZERVARI NU VEI VEDEA NIMIC IN LISTA DE REZERVARI");
            int b=input.nextInt();
            switch (b){
                case 1:
                    adaugaRestaurante();
                    break;
                case 2:
                    rezervaMasa();
                    break;
                case 3:
                    cautaRezervariRestaurant();
                    break;
                default:
            }
            System.out.println("Meniu \n Apasati:  'on' pentru a continua \n Apasati: 'exit' pentru a iesi din program ");
            a=input.next();
        }
    }

    private void adaugaRestaurante(){
        Restaurant restaurant=new Restaurant("def","def");
        Scanner input=new Scanner(System.in);
        System.out.println("Care este numele restaurantului ?");
        String c=input.nextLine();
        restaurant.setNume(c);
        System.out.println("Care este descrierea ?");
        String b=input.nextLine();
        restaurant.setDescriere(b);
        listaRestaurante.add(restaurant);
        System.out.println("Cate mese aveti ?");
        int a = input.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println("Masa no."+i+" cate scaune are ?");
            int numarlocuri=input.nextInt();
            System.out.println("Masa no."+i+" ce nume are ?");
            String nume=input.next();
            restaurant.adaugaInListaTipuriDeMese(numarlocuri,nume);
        }
restaurant.sorteazaMeseleDupaNumarulDeLocuri();
    }

    private void arataListaRestaurantePentruRezervari(){
        for (Restaurant n:listaRestaurante){
            System.out.println("Restaurantul: "+n.getNume()+" Detalii: "+n.getDescriere()+"; Are pentru rezervat : ");
           n.arateListaMesePentruRezervat();
        }
    }
    private void rezervaMasa(){

        Scanner input=new Scanner(System.in);
        arataListaRestaurantePentruRezervari();
        System.out.println("La ce restaurant doresti sa rezervi:");
        String numeRestaurant=input.nextLine();
        System.out.println("La ce data doresti sa rezervi ?");
        String a=input.nextLine();
        LocalDateTime newDate= LocalDateTime.parse(a);
        System.out.println("Cate ore doresti sa rezervi ?");
        int numarOre=input.nextInt();
        LocalDateTime newDatePlecare =newDate.plusHours(numarOre);
        System.out.println("Cate Persoane sunteti? ");
        int numarPersoane=input.nextInt();
        input.nextLine();
        System.out.println("Cum va numiti ?");
        String numePersoanaCareRezerva=input.nextLine();

        for (Restaurant n:listaRestaurante){
            if (numeRestaurant.equals(n.getNume())) {
                n.rezerva1Masa(numarPersoane,newDate,newDatePlecare,numePersoanaCareRezerva);
              if (cautaRezervariRestaurantDupaNume(numePersoanaCareRezerva)) {
                  System.out.println("***************************************");
                  System.out.println("Rezervare dumneavoastara a fost efectuata cu succes");
                  arataRezervariRestaurantDupaNume(numePersoanaCareRezerva,numeRestaurant);
                  System.out.println("***************************************");
              }else{
                  System.out.println("Rezervarea dumneavoastra nu a fost efectuata \n" +
                          "Daca nu a fost realizata este posibil sa nu fie suficiente locuri la mese sau sa nu fie disponibilitate in acel interval de timp. \n" +
                          "Verificati Lista de rezervari a restaurantului");
              }
                    }
                } }

    private void cautaRezervariRestaurant() {
        Scanner input=new Scanner(System.in);
        System.out.println("Rezervari: La ce restaurant vrei sa le vezi?");
        String numeRestaurant=input.nextLine();
        for (Restaurant n : listaRestaurante) {
            if (numeRestaurant.equals(n.getNume())) {
                System.out.println("Restaurantul: " + n.getNume() + "; Detalii: " + n.getDescriere() + "; Are urmatoarele rezervari : ");
                n.arataRezervariRestaurant();
                System.out.println();
            }
        }
    }
    private void arataRezervariRestaurantDupaNume(String numePersoanaCareRezerv,String numeRestaurant){
        for (Restaurant n:listaRestaurante){
            if (numeRestaurant.equals(n.getNume())){
            System.out.println("Restaurantul: " + n.getNume() + "; Detalii: " + n.getDescriere());
            n.arataRezervariRestaurantDupaNume(numePersoanaCareRezerv);}

        }
    }
    private boolean cautaRezervariRestaurantDupaNume(String numePersoanaCareRezerv){
        for (Restaurant n:listaRestaurante){
           if (n.cautaRezervareRestaurantDupaNume(numePersoanaCareRezerv)){
               return true;
           }
        }return false;
    }

}






