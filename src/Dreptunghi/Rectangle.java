package Dreptunghi;

public class Rectangle {
    public double lungimea=1;
    public double latimea=1;
    private double aria;
    private double perimetru;

    public Rectangle() {
        this.lungimea = 4;
        this.latimea = 2;
        this.aria=aria;
        this.perimetru=perimetru;
    }

    public Rectangle(double lungimea, double latimea) {
        this.lungimea = lungimea;
        this.latimea = latimea;
        this.aria=aria;
        this.perimetru=perimetru;
    }

    public double getAria() {
        aria=this.latimea*this.lungimea;
        return aria;
    }

    public double getPerimetru() {
       perimetru=(this.latimea+this.lungimea);
        return perimetru;
    }


}
