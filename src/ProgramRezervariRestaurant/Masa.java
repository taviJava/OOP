package ProgramRezervariRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Masa {
    private int numarLocuri;
    private String nume;
    List<Rezervare>  listaRezervareMasa =new ArrayList<>();


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

 private boolean verificaDacaDateleSeSuprapun(LocalDateTime newDate,LocalDateTime newDatePlecare){
        for (Rezervare n:listaRezervareMasa){
            if(n.getDataDeInceput().isEqual(newDate)||n.getDataDeInceput().isBefore(newDate)&&n.getDataDePlecare().isAfter(newDate)||
                    n.getDataDeInceput().isAfter(newDate)&&n.getDataDeInceput().isBefore(newDatePlecare)||n.getDataDeInceput().isBefore(newDatePlecare)&&n.getDataDePlecare().isEqual(newDatePlecare)
                    ){
                return true;
            }else
                return false;
        }return false;
 }

 private void adaugaPrimaRezervare(int numarPersoane,LocalDateTime newDate,LocalDateTime newDatePlecare,String numePersoanaCareRezerva){
     Rezervare rezervare=new Rezervare(numarPersoane,newDate,newDatePlecare,numePersoanaCareRezerva);
        listaRezervareMasa.add(rezervare);
 }
 private Rezervare adaugaRezervare2(int numarPersoane,LocalDateTime newDate,LocalDateTime newDatePlecare,String numePersoanaCareRezerva){
     Rezervare rezervare=new Rezervare(numarPersoane,newDate,newDatePlecare,numePersoanaCareRezerva);
     listaRezervareMasa.add(rezervare);
     return rezervare;
 }

 public Rezervare adaugaRezervareMasa(int a,LocalDateTime newDate,LocalDateTime newDatePlecare,String numePersoanaCareRezerva){
if(a<=this.getNumarLocuri()){
    if(listaRezervareMasa.size()==0){
        adaugaPrimaRezervare(a,newDate,newDatePlecare,numePersoanaCareRezerva);
    }else
        for (Rezervare n:listaRezervareMasa){
            if(verificaDacaDateleSeSuprapun(newDate,newDatePlecare)){

            }else
                return  adaugaRezervare2(a,newDate,newDatePlecare,numePersoanaCareRezerva);
        }}

        return null;
 }

 public void afiseazaRezervariMese(){
                for(Rezervare n:listaRezervareMasa){
                    System.out.println(" "+n.getDataDeInceput()+"Rezervarea este efectuata in intervalul:  "+n.getDataDePlecare()+" Sunt prezente: " +n.getNumarPersoane()+" persoane, la masa: "+this.getNume()+" cu "+this.getNumarLocuri()+ " locuri. Rezervarea a fost efectuata pe numele: "+n.getNumePersoanaCareARezervat());
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
        for (Rezervare n: listaRezervareMasa){

                        if (numePersoanaCareRezerv.equals(n.getNumePersoanaCareARezervat())){
                return true;
            }
            }
return false;
    }
            }



