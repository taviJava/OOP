package PersonalulDinFacultate;

public class PersonalFacultate extends Angajat {
    private String titlu;

    public PersonalFacultate(String nume, String adresa, int telefon, String email, String birou, int salariu, MyDate myDate, String titlu) {
        super(nume, adresa, telefon, email, birou, salariu, myDate);
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Numele: "+this.getNume()+" Face parte din clasa: "+this.getClass();
    }
}
