package tema.Factory;

public class Factory {
    private MasaBuilder masaStejar;
    private MasaBuilder masaMahon;
    private MasaBuilder masaTrandafir;

    public Factory() {
        masaStejar = new MasaBuilder();
        masaStejar.setColturiRotunde(false).setCuloare("Alb").setInaltime(100).setLatime(100).setSuprafataLucioasa(true).setLungime(200).setMaterial("Stejar").setPret(600);
        masaMahon = new MasaBuilder();
        masaMahon.setColturiRotunde(false).setCuloare("Negru").setInaltime(100).setLatime(100).setSuprafataLucioasa(true).setLungime(100).setMaterial("Mahon").setPret(400);
      masaTrandafir=new MasaBuilder();
        masaTrandafir.setColturiRotunde(false).setCuloare("Maro").setInaltime(100).setLatime(100).setSuprafataLucioasa(false).setLungime(150).setMaterial("Trandafir").setPret(800);

    }

    public MasaBuilder.Masa getMasa(int pret){
        MasaBuilder.Masa masa=null;
        if (pret>=400&&pret<=600){
            masa=masaMahon.build();
        }
        if (pret>=800&&pret<=1000){
            masa=masaTrandafir.build();
        }
        if (pret>=600&&pret<=800){
            masa=masaStejar.build();
        }


        return masa;
    }


}
