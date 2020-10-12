package Stock;

public class MainStock {
    public static void main(String[] args) {
        Stock stock=new Stock("ciocolata","Milka",495.22,467.22);
        StockChangePercent stockChangePercent=new StockChangePercent();
        Double procent= StockChangePercent.getChangePercent(stock.getClosingPrice(),stock.getCurrentPrice());
        String a=stock.getStoc()+" "+stock.getSimbolStoc();
        procent=Math.round(procent*20.0)/20.0;
        System.out.println("Procentul stocului updatat este scazut la: "+a+" "+procent+" % fata de ziua precedenta");

    }
}
