package PersonalulDinFacultate;

public class Student extends Persoana{
    StatutDeClasa statutDeClasa=StatutDeClasa.boboc;

    public Student(String nume, String adresa, int telefon, String email, StatutDeClasa statutDeClasa) {
        super(nume, adresa, telefon, email);
        this.statutDeClasa = statutDeClasa;
    }
    @Override
    public String toString() {
        return "Numele: "+this.getNume()+" Face parte din clasa: "+this.getClass();

    }
}
