package tema.Builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
MasaBuilder masaStejar=new MasaBuilder();
masaStejar.setColturiRotunde(false).setCuloare("Alb").setInaltime(100).setLatime(100).setSuprafataLucioasa(true).setLungime(200).setMaterial("Stejar");
MasaBuilder masaTrandafir=new MasaBuilder();
masaTrandafir.setColturiRotunde(false).setCuloare("Maro").setInaltime(100).setLatime(100).setSuprafataLucioasa(false).setLungime(150).setMaterial("Trandafir");
MasaBuilder masaMahon=new MasaBuilder();
masaMahon.setColturiRotunde(false).setCuloare("Negru").setInaltime(100).setLatime(100).setSuprafataLucioasa(true).setLungime(100).setMaterial("Mahon");

int optiune =-1;
while (optiune!=0){
    System.out.println("1. Construieste Masa Stejar");
    System.out.println("2. Construieste Masa Trandafir");
    System.out.println("3. Construieste Masa Mahon");
    System.out.println("0. Exit");
    optiune=scanner.nextInt();
    scanner.nextLine();
    if (optiune==1){
       MasaBuilder.Masa masa= masaMahon.build();
        System.out.println("am construit o masa: "+masa);
    }
    if (optiune==2){
        MasaBuilder.Masa masa=masaStejar.build();
        System.out.println("am construit o masa: "+masa);
    }
    if (optiune==3){
        MasaBuilder.Masa masa=masaTrandafir.build();
        System.out.println("am construit o masa: "+masa);
    }
}
    }
}
