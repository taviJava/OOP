package Cerc;

import java.util.Scanner;

public class MainCerc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Cerc cerc=new Cerc();
        AriaCerc ariaCerc=new AriaCerc();
        System.out.print("Introdu raza cercului: ");
        cerc.setRaza(input.nextDouble());
        double aria1= AriaCerc.ariacerc(cerc.getRaza(),3.14);
        System.out.println("Afiseaza aria cerc cu metoda din clasa ProblemaCerc.AriaCerc: ");
        System.out.println(aria1);
        System.out.println("Afiseaza aria cerc cu metoda din ProblemaCerc.Cerc:");
        System.out.println(cerc.aria());
//Aici am facut cu doua metode intrucat am vrut sa exersez, rezultatele sunt la fel

    }
}
