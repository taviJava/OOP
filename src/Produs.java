public class Produs {
    private String nume;
    private String descriere;
    private int pret;

    public Produs(String nume, String descriere, int pret) {
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public int getPret() {
        return pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
