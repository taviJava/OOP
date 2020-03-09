package Magazin;

public class Fructe extends Perisabile {
    private String taraDeOrigine;

    public Fructe(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura, Date dataExpirare, Date dataFabricatie, String taraDeOrigine) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura, dataExpirare, dataFabricatie);
        this.taraDeOrigine = taraDeOrigine;
    }
}
