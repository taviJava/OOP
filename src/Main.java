import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produs produs1=new Produs("Tide","detergent rufe",8);
        Produs produs2=new Produs("Ariel","detergent rufe",7);
        ArrayList<Produs> listaDeProduse=new ArrayList<Produs>();
        listaDeProduse.add(produs1);
        listaDeProduse.add(produs2);
        Cos cos=new Cos();
        double total =cos.suma(listaDeProduse);
        System.out.println("pretul total este: "+total);
    }

}
