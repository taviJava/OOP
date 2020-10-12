package cont;

public class MonthlyInterestDate {
    public static double getMonthlyInterestDate(double soldInitial){
        double dobanda=soldInitial/10;  //am vrut ca dobanda anuala sa fie de 10% din sold
        double sold=soldInitial-(dobanda/12); //dobanda lunara este dobanda impartit la 12
        return sold;
    }
}
