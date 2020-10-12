package Magazin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazin {
    HashMap<Produs, Integer> listaMapStock = new HashMap<>();
    List<Produs> listaCosProduse = new ArrayList<Produs>();

    public Produs addToCos(String c) {
        for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
            Produs a = n.getKey();
            Integer b = n.getValue();
            if(c.equals(a.getNume())){
                listaCosProduse.add(a);
                System.out.println(a.getNume());
            }

        }return null;
    }

    public void showCosList() {
        for (Produs n : listaCosProduse) {
            System.out.println(n.getNume() + " -  " + n.unitateDeMasura);
        }
    }

    public void addToStockMap(Produs b, Integer c) {
        listaMapStock.put(b, c);
    }

    public void showListStockMap() {
        for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
            Produs a = n.getKey();
            Integer b = n.getValue();
            System.out.println(a.getNume() + " - " + b + " " + a.unitateDeMasura);

        }
    }

    public Produs findProdus(String c) {
        for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
            Produs a = n.getKey();
            Integer b = n.getValue();
            if (c.equals(a.getNume())) {
                System.out.println(a.getNume() + " - " + b + " " + a.unitateDeMasura);
                return a;
            }
        }
        return null;
    }

    public Produs CumparaProduse() {
        for (Produs x : listaCosProduse) {
            for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
                Produs a = n.getKey();
                Integer b = n.getValue();

                if (x.getNume().equals(a.getNume()) && b == 1) {
                    listaMapStock.remove(a);
                    return a;
                }
            }


        }return null;
    }

    public Produs CumparaProduse2(int i) {

        while(i<listaCosProduse.size()){
            String z=listaCosProduse.get(i).getNume();


            for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
                Produs a = n.getKey();
                Integer b = n.getValue();
                if (z.equals(a.getNume()) && b > 1) {
                    listaMapStock.replace(a, (b - 1));
                    return null;
                }
            }
            for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
                Produs a = n.getKey();
                Integer b = n.getValue();
                if (z.equals(a.getNume()) && b == 1) {
                    //  listaMapStock.remove(a);

                }
            }

            i++;





        }return null;
    }
    public Produs CumparaProduse3(int i) {

        while(i<listaCosProduse.size()){
            String z=listaCosProduse.get(i).getNume();


            for (Map.Entry<Produs, Integer> n : listaMapStock.entrySet()) {
                Produs a = n.getKey();
                Integer b = n.getValue();
                if (z.equals(a.getNume()) && b == 1) {
                     listaMapStock.remove(a);
return a;
                }
            }

            i++;


        }return null;
    }

    public void StergeProduseDinCos(){
        listaCosProduse.clear();
    }
}