package RezervariRestaurantLast;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurant implements Serializable{
    private List<Masa> listaTipuriDeMese=new ArrayList<>();
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
        listaTipuriDeMese.sort(Comparator.comparing(Masa::getNumarLocuri));
    }
    public void adaugaInListaTipuriDeMese(int numarLocuri,String nume){
        Masa masa=new Masa(numarLocuri,nume);
        listaTipuriDeMese.add(masa);
    }
    public void arateListaMesePentruRezervat(){
        for (Masa masa: listaTipuriDeMese){
            System.out.println("Masa: "+masa.getNume()+" cu " +masa.getNumarLocuri() +" locuri");
        }
    }
    public void rezerva1Masa(int numarPersoane, LocalDateTime dataVenire, LocalDateTime dataPlecare, String numePersoanaCareRezerva) {

        for (int i = 0; i < listaTipuriDeMese.size(); i++) {
            if(numarPersoane<=listaTipuriDeMese.get(i).getNumarLocuri()&&listaTipuriDeMese.get(i).verificaDacaDateleSeSuprapun2(dataVenire,dataPlecare)){
                listaTipuriDeMese.get(i).adaugaRezervareMasa(numarPersoane, dataVenire, dataPlecare,numePersoanaCareRezerva);
                break;
            }
        } }


    public void scrieInFileListaCuTipuriDeMese(File file)  {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this.listaTipuriDeMese);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void importaInLista(File file){ //inlocuieste pe importaDoarDacaNuEGol
        try (FileInputStream fileInputStream = new FileInputStream (file);
             ObjectInputStream objectInputStream= new ObjectInputStream (fileInputStream)){
            this.listaTipuriDeMese=(List<Masa>)objectInputStream.readObject();
        }catch(Exception e){
        }
    }

    public void arataRezervariRestaurant(){
        for (Masa masa:listaTipuriDeMese){
            masa.afiseazaRezervariMese();
        }
    }
    public void arataRezervariRestaurantDupaNume(String numePersoanaCareRezerv) {
        for (Masa masa : listaTipuriDeMese) {
            if (masa.cautaRezervareDupaNume(numePersoanaCareRezerv)) {
                masa.afiseazaRezervariMeseCautandDupaNume(numePersoanaCareRezerv);
            }
        }
    }
    public boolean cautaRezervareRestaurantDupaNume(String numePersoanaCareRezerv){
        for (Masa masa:listaTipuriDeMese){
            if (masa.cautaRezervareDupaNume(numePersoanaCareRezerv)) {
                return true;
            }
        }return false;
    }


    public void importaRezervari(File newFile,String masa1) throws IOException {
        for (Masa masa:listaTipuriDeMese){
            if(masa1.equals(masa.getNume())){
                masa.importaInLista(newFile);}
        }
    }

    public void creazaUnFileCuNumeRestaurantSiNumeMasa(String numeRestaurant){
        for (Masa masa:listaTipuriDeMese){
            masa.scrieInFileListaDeRezervari(numeRestaurant);
        }
    }
}

