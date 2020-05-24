package tema.Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Factory factory=new Factory();
        int pret=-1;

        while (pret!=0){
            System.out.println("Introdu Buget");
            System.out.println("0. Exit");
            pret=scanner.nextInt();
            scanner.nextLine();
            MasaBuilder.Masa masa=factory.getMasa(pret);
            if (pret<400){
                System.out.println("Fonduri insuficiente pentru construirea unei mese");
            }else {
                System.out.println("S-a construit: "+masa);
            }


        }
    }
}
