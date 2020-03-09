package Magazin;

public class Haine extends Produs{
    private String Material;

    public Haine(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura, String material) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura);
        Material = material;
    }

}
