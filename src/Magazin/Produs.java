package Magazin;

public class Produs {
    private double pret;
    private String nume;
    private String cod;
    private String detalii;
    private String producator;
   UnitateDeMasura unitateDeMasura;

    public Produs(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura) {
        this.pret = pret;
        this.nume = nume;
        this.cod = cod;
        this.detalii = detalii;
        this.producator = producator;
        this.unitateDeMasura = unitateDeMasura;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public UnitateDeMasura getUnitateDeMasura() {
        return unitateDeMasura;
    }

    public void setUnitateDeMasura(UnitateDeMasura unitateDeMasura) {
        this.unitateDeMasura = unitateDeMasura;
    }
}
