package PersonalulDinFacultate;

public class Angajat extends Persoana{
    private String birou;
    private int salariu;
    MyDate myDate=new MyDate(2005,6,8);

    public Angajat(String nume, String adresa, int telefon, String email, String birou, int salariu, MyDate myDate) {
        super(nume, adresa, telefon, email);
        this.birou = birou;
        this.salariu = salariu;
        this.myDate = myDate;
    }

    public String getBirou() {
        return birou;
    }

    public void setBirou(String birou) {
        this.birou = birou;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
    @Override
    public String toString() {
        return this.getNume()+" "+this.getClass().getName();
    }
}
