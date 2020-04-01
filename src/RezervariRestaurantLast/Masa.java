package RezervariRestaurantLast;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Masa implements Serializable {
    private int numarLocuri;
    private String nume;
    private List<Rezervare> listaRezervareMasa =new ArrayList<>();


    public Masa(int numarLocuri, String nume) {
        this.numarLocuri = numarLocuri;
        this.nume = nume;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public String getNume() {
        return nume;
    }

    private boolean verificaDacaDateleSeSuprapun(LocalDateTime newDate, LocalDateTime newDatePlecare){
        for (Rezervare n:listaRezervareMasa){
            if(n.getDataDeInceput().isEqual(newDate)||n.getDataDeInceput().isBefore(newDate)&&n.getDataDePlecare().isAfter(newDate)||
                    n.getDataDeInceput().isAfter(newDate)&&n.getDataDeInceput().isBefore(newDatePlecare)||n.getDataDeInceput().isBefore(newDatePlecare)&&n.getDataDePlecare().isEqual(newDatePlecare)
            ){
                return true;
            }else
                return false;
        }return false;
    }
    public boolean verificaDacaDateleSeSuprapun2(LocalDateTime newDate,LocalDateTime newDatePlecare){
        for (Rezervare n:listaRezervareMasa){
            if(n.getDataDeInceput().isEqual(newDate)||n.getDataDeInceput().isBefore(newDate)&&n.getDataDePlecare().isAfter(newDate)||
                    n.getDataDeInceput().isAfter(newDate)&&n.getDataDeInceput().isBefore(newDatePlecare)||n.getDataDeInceput().isBefore(newDatePlecare)&&n.getDataDePlecare().isEqual(newDatePlecare)
            ){
                return false;
            }

        }return true;
    }

    private Rezervare adaugaRezervare2(int numarPersoane, LocalDateTime newDate, LocalDateTime newDatePlecare, String numePersoanaCareRezerva){
        Rezervare rezervare=new Rezervare(numarPersoane,newDate,newDatePlecare,numePersoanaCareRezerva);
        listaRezervareMasa.add(rezervare);
        return rezervare;
    }

    public Rezervare adaugaRezervareMasa(int a, LocalDateTime newDate, LocalDateTime newDatePlecare, String numePersoanaCareRezerva){
        if(a<=this.getNumarLocuri()){
            if(listaRezervareMasa.size()==0){
                adaugaRezervare2(a,newDate,newDatePlecare,numePersoanaCareRezerva);
            }else
                for (Rezervare rezervare:listaRezervareMasa){
                    if(verificaDacaDateleSeSuprapun(newDate,newDatePlecare)){

                    }else
                        return  adaugaRezervare2(a,newDate,newDatePlecare,numePersoanaCareRezerva);
                }}

        return null;
    }



    public void importaInLista(File file){ //inlocuieste pe importaDoarDacaNuEGol
        try (FileInputStream fileInputStream = new FileInputStream (file);
             ObjectInputStream objectInputStream= new ObjectInputStream (fileInputStream)){
            this.listaRezervareMasa=(List<Rezervare>)objectInputStream.readObject();
        }catch(Exception e){
        }
    }


    public void afiseazaRezervariMese(){
        for(Rezervare rezervare:listaRezervareMasa){
            System.out.println("Rezervarea este efectuata in intervalul:  "+rezervare.getDataDeInceput()+" - "+rezervare.getDataDePlecare()+" Sunt prezente: " +rezervare.getNumarPersoane()+
                    " persoane, la masa: "+this.getNume()+" cu "+this.getNumarLocuri()+ " locuri. Rezervarea a fost efectuata pe numele: "+rezervare.getNumePersoanaCareARezervat());
        }
    }

    public void scrieInFileListaDeRezervari(String numeRestaurant)  {
        try (FileOutputStream fileOutputStream = new FileOutputStream(numeRestaurant+""+this.nume+"Rezervare.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this.listaRezervareMasa);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }




    public void afiseazaRezervariMeseCautandDupaNume(String numePersoanaCareRezerva){
        for(Rezervare n:listaRezervareMasa){
            if(numePersoanaCareRezerva.equals(n.getNumePersoanaCareARezervat())) {
                System.out.println(" " + n.getDataDeInceput() + "  " + n.getDataDePlecare() + " persoane " + n.getNumarPersoane()
                        + " la masa " + this.getNume() + " cu " + this.getNumarLocuri() +
                        " locuri. Rezervarea a fost efectuata pe numele: " + n.getNumePersoanaCareARezervat());
            }
        }
    }
    public boolean cautaRezervareDupaNume(String numePersoanaCareRezerv){
        for (Rezervare rezervare: listaRezervareMasa){

            if (numePersoanaCareRezerv.equals(rezervare.getNumePersoanaCareARezervat())){
                return true;
            }
        }
        return false;
    }
}



