package PersonalulDinFacultate;

public class Persoana {
    private String nume;
    private String adresa;
    private int telefon;
    private String email;

    public Persoana(String nume, String adresa, int telefon, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.getNume()+" "+this.getClass().getName();
    }
}
