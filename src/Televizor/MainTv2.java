package Televizor;

import java.util.Scanner;

public class MainTv2 {
    public static void main(String[] args) {

        Televizor televizor = new Televizor(6);
        Scanner input = new Scanner(System.in);
        System.out.println("Menu \n 1.Apasati: on \n 2.Apasati: off");
        String a = input.next();
        televizor.setPornitOprit(a);
        String Menu = "menu";
        String c;
        int b = 10;
        televizor.setCanal(b);
        while (a.equals("on")) {
            System.out.println(" Menu1 - Schimbare Canal \n Menu2 - Incrementare/Decremenetare Canal \n Menu3 - Incrementare/Decremenetare Volum \n Exit - revenire meniu anterior");
            Menu = input.next();
            switch (Menu) {
                case "Menu1":
                    System.out.println("Introdu: 'p' , pentru schimbare canalul sau: 'exit' pentru a reveni la meniul anterior");
                    c = input.next();
                    while (c.equals("p")) {
                        System.out.println("Comuta pe canalul dorit: 1 - 100");
                        b = input.nextInt();
                        if (b >= 1 || b <= 100) {
                            televizor.setCanal(b);
                            System.out.println("Canalul: " + televizor.getCanal());
                        } else if (b < 1 || b > 100) {
                            System.out.println("Ne pare rau, un canal poate fi cuprins intre: 0 si 100");
                            System.out.println("Canalul: " + televizor.getCanal());
                        }
                        System.out.println("Introdu: 'p' , pentru schimbarea canalului sau: 'exit' pentru a reveni la meniul anterior");
                        c = input.next();
                    }if (!c.equals("exit")){
                    System.out.println("Eroare, trebuia sa introduci: 'p' sau 'exit'");
                }
                    break;

                case "Menu2":
                    System.out.println("Introdu: 'p+' pentru canalul urmator sau : 'p-' pentru canalul anterior");
                    c = input.next();
                    while (c.equals("p+") || c.equals("p-")) {
                        if (c.equals("p+")) {

                            if (televizor.getCanal() != 100) {
                                televizor.setCanal((televizor.getCanal() + 1));
                                System.out.println("Canalul: " + televizor.getCanal());
                            } else if (televizor.getCanal() == 100) {
                                televizor.setCanal(1);
                                System.out.println("Canalul: " + televizor.getCanal());
                            }
                        }
                        if (c.equals("p-")) {
                            if (b != 1) {
                                televizor.setCanal(televizor.getCanal() - 1);
                                System.out.println("Canalul: " + televizor.getCanal());
                            } else System.out.println("Canalul: " + televizor.getCanal());
                        }
                        System.out.println("Introdu: 'p+' pentru canalul urmator sau : 'p-' pentru canalul anterior sau 'exit' pentru a reveni la meniul anterior");
                        c = input.next();
                    }
                    System.out.println("Eroare, trebuie sa introduci: p+ sau p-");
                    break;
                case "Menu3":
                    System.out.println("Introdu: 'v+' pentru a mari volumul : 'v-' pentru a micsora volumul");
                    c = input.next();
                    while (c.equals("v+") || c.equals("v-")) {
                        if (c.equals("v+")) {
                            if (televizor.getVolum() != 50) {
                                televizor.setVolum(televizor.getVolum() + 1);
                                System.out.println("Volumul este: " + televizor.getVolum());
                            } else if (televizor.getVolum() == 50) {
                                televizor.setVolum(televizor.getVolum());
                                System.out.println("Volumul este: " + televizor.getVolum());
                            }
                        } if (c.equals("v-")) {
                            if (televizor.getVolum() != 0) {
                                televizor.setVolum(televizor.getVolum() - 1);
                                System.out.println("Volumul este: " + televizor.getVolum());
                            } else if (televizor.getVolum() == 0) {
                                televizor.setVolum(televizor.getVolum());
                                System.out.println("Volumul este: " + televizor.getVolum());
                            }
                        }else
                        System.out.println("Introdu: 'v+' pentru a mari volumul : 'v-' pentru a micsora volumul sau 'exit' pentru a reveni la meniul anterior");
                        c = input.next();
                    }
                    System.out.println("Eroare, trebuie sa introduci: v+ sau v-");
                    break;
                default:
                    System.out.println("Eroare, trebuia sa introduci: 'Menu1' , 'Menu2' , 'Menu3' sau exit");

            }
            System.out.println("Menu \n 1.Apasati: on \n 2.Apasati: off");
            a=input.next();
        }
        if (!a.equals("off")||!a.equals("on")){
            System.out.println("Eroare, trebuia sa introduci: 'on' sau 'off'");
        }
    }
}
