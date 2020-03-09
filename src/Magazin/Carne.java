package Magazin;

public class Carne extends Perisabile{
    tipCarne tipCarne;

    public Carne(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura, Date dataExpirare, Date dataFabricatie, tipCarne tipCarne) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura, dataExpirare, dataFabricatie);
        this.tipCarne = tipCarne;
    }
}
