package RezervariRestaurantLast;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RezervingSystemApp {
    private List<Restaurant> listaRestaurante = new ArrayList<>();
    File fileListaRestaurante=new File("dateListaRestaurante.txt");

    public RezervingSystemApp() {
        this.listaRestaurante = listaRestaurante;
    }

    public void scrieInFileListaCuTipuriDeRestaurante() {  //inlocuieste pe scrieInLista()
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileListaRestaurante);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this.listaRestaurante);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void importaInLista(){ //inlocuieste pe importaDoarDacaNuEGol
        try (FileInputStream fileInputStream = new FileInputStream (fileListaRestaurante);
             ObjectInputStream objectInputStream= new ObjectInputStream (fileInputStream)){
            this.listaRestaurante=(List<Restaurant>)objectInputStream.readObject();
        }catch(Exception e){
        }
    }

    public void importaMese() throws IOException {
        for (int b=0;b<listaRestaurante.size();b++){
            String numeFile3=listaRestaurante.get(b).getNume() + "" +listaRestaurante.get(b).getDescriere()+".txt";
            try {
                BufferedReader csvReader = new BufferedReader(new FileReader(numeFile3));
                String [] data = csvReader.readLine().split(",");
                for (int i=0;i<data.length;i++){
                    String numeFile = (listaRestaurante.get(b).getNume() + "" + data[i]+".txt");
                    File newFile = new File(numeFile);
                    listaRestaurante.get(b).importaInLista(newFile);

                }
            }catch (Exception e){

            }
            listaRestaurante.get(b).sorteazaMeseleDupaNumarulDeLocuri();
        }
    }

    private void importaRezervari(String numeMasa) throws IOException {

        for (int i=0;i<listaRestaurante.size();i++){
            File newFile=new File(listaRestaurante.get(i).getNume()+""+numeMasa+"Rezervare.txt");
            if (newFile.exists()){
                listaRestaurante.get(i).importaRezervari(newFile,numeMasa);}

        }
    }


    public void importaRezervariTrue(){
        for (int b=0;b<listaRestaurante.size();b++){
            String numeFile3=listaRestaurante.get(b).getNume() + "" +listaRestaurante.get(b).getDescriere()+".txt";

            try {
                BufferedReader csvReader = new BufferedReader(new FileReader(numeFile3));
                String [] data = csvReader.readLine().split(",");

                for (int i=0;i<data.length;i++){
                    importaRezervari(data[i]);

                }
            }catch (Exception e){

            }
        }}

    public void Meniu() throws IOException {
        Scanner input=new Scanner(System.in);

        importaInLista();
        importaMese();
        importaRezervariTrue();


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
        scrieInFileListaCuTipuriDeRestaurante();
        System.out.println("Cate mese aveti ?");
        int a = input.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println("Masa no."+i+" cate scaune are ?");
            int numarlocuri=input.nextInt();
            System.out.println("Masa no."+i+" ce nume are ?");
            String nume=input.next();
            restaurant.adaugaInListaTipuriDeMese(numarlocuri,nume);
            String numeFile=(restaurant.getNume()+""+nume+".txt");
            File newFile=new File(numeFile);
            restaurant.scrieInFileListaCuTipuriDeMese(newFile);
            String numeFile2=(restaurant.getNume()+""+restaurant.getDescriere()+".txt");
            try(FileWriter fw = new FileWriter(numeFile2, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
            {
                File file=new File(numeFile2);
                if (file.length()==0){
                    out.print(nume);
                }if (file.length()>0){
                out.print(","+nume);
            }
            } catch (IOException e) {

            }

        }
        restaurant.sorteazaMeseleDupaNumarulDeLocuri();
    }

    private void arataListaRestaurantePentruRezervari(){
        for (Restaurant restaurant:listaRestaurante){
            System.out.println("Restaurantul: "+restaurant.getNume()+" Detalii: "+restaurant.getDescriere()+"; Are pentru rezervat : ");
            restaurant.arateListaMesePentruRezervat();
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

        for (Restaurant restaurant:listaRestaurante){
            if (numeRestaurant.equals(restaurant.getNume())) {
                restaurant.rezerva1Masa(numarPersoane,newDate,newDatePlecare,numePersoanaCareRezerva);
                if (cautaRezervariRestaurantDupaNume(numePersoanaCareRezerva)) {
                    System.out.println("***************************************");
                    System.out.println("Rezervare dumneavoastara a fost efectuata cu succes");
                    arataRezervariRestaurantDupaNume(numePersoanaCareRezerva,numeRestaurant);
                    System.out.println("***************************************");
                    restaurant.creazaUnFileCuNumeRestaurantSiNumeMasa(restaurant.getNume());

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
        for (Restaurant restaurant : listaRestaurante) {
            if (numeRestaurant.equals(restaurant.getNume())) {
                System.out.println("Restaurantul: " + restaurant.getNume() + "; Detalii: " + restaurant.getDescriere() + "; Are urmatoarele rezervari : ");
                restaurant.arataRezervariRestaurant();
                System.out.println();
            }
        }
    }
    private void arataRezervariRestaurantDupaNume(String numePersoanaCareRezerv,String numeRestaurant){
        for (Restaurant restaurant:listaRestaurante){
            if (numeRestaurant.equals(restaurant.getNume())){
                System.out.println("Restaurantul: " + restaurant.getNume() + "; Detalii: " + restaurant.getDescriere());
                restaurant.arataRezervariRestaurantDupaNume(numePersoanaCareRezerv);}

        }
    }
    private boolean cautaRezervariRestaurantDupaNume(String numePersoanaCareRezerv){
        for (Restaurant restaurant:listaRestaurante){
            if (restaurant.cautaRezervareRestaurantDupaNume(numePersoanaCareRezerv)){
                return true;
            }
        }return false;
    }
}

