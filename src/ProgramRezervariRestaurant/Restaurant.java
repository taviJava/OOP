package ProgramRezervariRestaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurant {
    List<Masa>  ListaTipuriDeMese=new ArrayList<>();
    private String nume;
    private String descriere;

    public Restaurant( String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void sorteazaMeseleDupaNumarulDeLocuri(){
        ListaTipuriDeMese.sort(Comparator.comparing(Masa::getNumarLocuri));
    }
    public void adaugaInListaTipuriDeMese(int numarLocuri,String nume){
        Masa masa=new Masa(numarLocuri,nume);
        ListaTipuriDeMese.add(masa);
    }
    public void arateListaMesePentruRezervat(){
        for (Masa n: ListaTipuriDeMese){
            System.out.println("Masa: "+n.getNume()+" cu " +n.getNumarLocuri() +" locuri");
        }
    }
public void rezerva1Masa(int numarPersoane, LocalDateTime dataVenire,LocalDateTime dataPlecare,String numePersoanaCareRezerva) {

    for (int i = 0; i < ListaTipuriDeMese.size(); i++) {
if(numarPersoane<=ListaTipuriDeMese.get(i).getNumarLocuri()){
    ListaTipuriDeMese.get(i).adaugaRezervareMasa(numarPersoane, dataVenire, dataPlecare,numePersoanaCareRezerva);
            break;
        }
    } }

public void arataRezervariRestaurant(){
    for (Masa n:ListaTipuriDeMese){
        n.afiseazaRezervariMese();
    }
}
    public void arataRezervariRestaurantDupaNume(String numePersoanaCareRezerv) {
        for (Masa n : ListaTipuriDeMese) {
            if (n.cautaRezervareDupaNume(numePersoanaCareRezerv)) {
                n.afiseazaRezervariMeseCautandDupaNume(numePersoanaCareRezerv);
            }
        }
    }
    public boolean cautaRezervareRestaurantDupaNume(String numePersoanaCareRezerv){
        for (Masa n:ListaTipuriDeMese){
            if (n.cautaRezervareDupaNume(numePersoanaCareRezerv)) {
               return true;
            }
        }return false;
    }
    }











