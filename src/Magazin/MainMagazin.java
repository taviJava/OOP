package Magazin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainMagazin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Date dateExpirare=new Date(23,9,2023);
        Date dateProductie=new Date(20,1,2020);
        Magazin Kaufland=new Magazin();

        Produs blugiLevis=new Haine(100,"Levis","212","din material reciclabil", "Levis",UnitateDeMasura.Bucata,"textil");
        Produs blugiTommy=new Haine(100,"Tommy","213","din material reciclabil", "Tommy Jeans",UnitateDeMasura.Bucata,"textil");
        Produs blugiGStar=new Haine(100,"G-Star","214","din material reciclabil", "G-Star",UnitateDeMasura.Bucata,"textil");
        Produs portocale =new Fructe(10,"portocale","23","citrice","FructeStarSRL",UnitateDeMasura.Kilogram,dateExpirare,dateProductie,"Japonia");
        Produs salamSibi= new Carne(25,"salamSibiu","322","salam cu carne","Diana",UnitateDeMasura.Kilogram,dateExpirare,dateProductie,tipCarne.porc);
        Kaufland.addToStockMap(blugiLevis,10);
        Kaufland.addToStockMap(blugiTommy,1);
        Kaufland.addToStockMap(blugiGStar,12);
        Kaufland.addToStockMap(portocale,40);
        Kaufland.addToStockMap(salamSibi,20);
        //Kaufland.addToCos("Tommy");


        System.out.println("Menu \n Apasti 'on' - pentru a intra in meniu\n Apasati 'exit'- pentru a iesi din meniu");
        String a=input.next();
        while(a.equals("on")){
            System.out.println("Menu \n Apasati 'view' -pentru a vizualiza produsele din stock \n Apasati 'find' -pentru a cauta un produs \n Apasati 'add' pentru a adauga in cos \n Apasati 'buy' pentru a cumpara produsele din cos");
      String b=input.next();
      switch (b){
          case "view":
              Kaufland.showListStockMap();
              break;
          case "find":
              Kaufland.findProdus(input.next());

              break;
          case "add":
              Kaufland.addToCos(input.next());
              break;
          case "buy":
              Kaufland.CumparaProduse2(0); //metoda pt a scadea produsul din stock cu o unitate
              Kaufland.CumparaProduse3(0); //metoda pentru a elimina produsul din stock in caz ca acesta este 0
              Kaufland.StergeProduseDinCos();
break;
          default:

      }System.out.println("Menu \n Apasti 'on' - pentru a continua \n Apasati 'exit'- pentru a iesi din meniu");
            a=input.next();

        }


    }
}
