package cont;

public class Cont {
    private int id;
    private double sold;
    private double anualInterestRate;
    private int dateCreated;

    public Cont() {
        this.id = id;
        this.sold = sold;
        this.anualInterestRate = anualInterestRate;
        this.dateCreated = dateCreated;
    }

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;
        this.anualInterestRate = anualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getSold() {
        return sold;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }
}
