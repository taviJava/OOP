package cont;

import java.util.Scanner;

public class MainCont {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Cont cont=new Cont(234,4800);
        System.out.println("Buna ziua, suma contului dumneavoastra este: "+cont.getSold());
        System.out.println("Menu \n Apasati 'on' pentru a intra in Menu");
        String b=input.next();
while(cont.getSold()!=0 && b.equals("on")) {
    System.out.println("Menu: \n Apasati: '1' - pentru retragere \n Apasati '2' - pentru depunere \n Apasati '3' - pentru plata dobanzii");
    int menu=input.nextInt();
    switch (menu) {
        case 1:
        System.out.println("Introdu suma de retragere:");
        cont.setSold(Retragere.getRetragere(cont.getSold(), input.nextDouble()));
        System.out.println("Soldul actualizat este: " + cont.getSold());
break;
        case 2:
        System.out.println("Introdu suma de depunere: ");
        cont.setSold(Depozit.getDepozit(cont.getSold(), input.nextDouble()));
            cont.setSold(Math.round(cont.getSold()*10.0)/10.0);
        System.out.println("Soldul actualizat este: " + cont.getSold());
break;
        case 3:
        cont.setSold(MonthlyInterestDate.getMonthlyInterestDate(cont.getSold()));
        System.out.println("Soldul actualizat dupa retragera dobanzii este: " + cont.getSold());
        break;
        default:
            System.out.println("Ne pare rau, nu ati ales una din variantele din meniu ");

    }
    System.out.println("Menu. \n Apasati- 'on' pentru a continua n/ Apasati 'off' pentru a iesi din meniu");
    b=input.next();
    if(b.equals("on")||b.equals("off")){

    }else System.out.println("Ne pare rau, nu ati introdus una din tastele din meniu");
}
    }
}
