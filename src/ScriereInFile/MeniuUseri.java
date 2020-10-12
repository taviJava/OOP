package TestulDoi;

import java.io.IOException;
import java.util.Scanner;

public class MeniuUseri {

    public void meniu() throws IOException {
        Scanner input=new Scanner(System.in);
        System.out.println("Meniu\n Pentru a adauga un user in lista apasa '1' \n Pentru a vizuliza lista apasa '2' \n  Pentru a sterge un user din lista apasa'3' \n Pentru a inchide programul apasa '0'");
        int a=input.nextInt();
        ListaUseri listaUseri=new ListaUseri();
        listaUseri.importaDoarDacaNuEGol();  //tot timpul metoda de import se pune inainte loop-ului deoarece riscam sa importe in mod repetitiv aceleasi linii ci noi avem nevoie sa o faca decat odata
        while(a==1||a==2||a==3){
            switch (a){
                case 1:
                    listaUseri.adaugaInLista();
                    listaUseri.scrieInLista();

                    break;
                case 2:
                    listaUseri.arataElementeLista();
                    break;
                case 3:
                    System.out.println("Introdu username-ul");
                    String b=input.next();
                    listaUseri.stergeElementdinLista(b);
                    break;
                default:
            }
            System.out.println("Meniu\n Pentru a adauga un user in lista apasa '1' \n Pentru a vizuliza lista apasa '2' \n  Pentru a sterge un user din lista apasa'3' \n Pentru a inchide programul apasa '0'");
            a=input.nextInt();
        }
    }
}
