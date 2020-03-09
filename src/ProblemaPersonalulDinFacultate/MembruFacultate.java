package PersonalulDinFacultate;

public class MembruFacultate extends Angajat{
    private int oreBirou;
    private String rang;

    public MembruFacultate(String nume, String adresa, int telefon, String email, String birou, int salariu, MyDate myDate, int oreBirou, String rang) {
        super(nume, adresa, telefon, email, birou, salariu, myDate);
        this.oreBirou = oreBirou;
        this.rang = rang;
    }

    public int getOreBirou() {
        return oreBirou;
    }

    public void setOreBirou(int oreBirou) {
        this.oreBirou = oreBirou;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
    @Override
    public String toString() {
        return "Numele: "+this.getNume()+" Face parte din clasa: "+this.getClass();

    }

}
