package cont;

public class Retragere  {
    public static double getRetragere (double soldInitial,double retragere){
        double sold;
        if(retragere<soldInitial) {
             sold = soldInitial - retragere;
        }else{ System.out.println("Fonduri insuficiente, introduceti o suma mai mica");
            sold=soldInitial;}
        return sold;
    }

}
