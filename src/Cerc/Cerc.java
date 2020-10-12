package Cerc;

public class Cerc {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public Cerc() {
        this.raza =raza;
    }
    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }
    public double aria(){
        double Pi=3.14;
        double ariaCerc=Pi*(this.raza*this.raza);
        return ariaCerc;
    }
}
