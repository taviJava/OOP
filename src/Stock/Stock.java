package Stock;

public class Stock {
    private String stoc;
    private String simbolStoc;
    private double closingPrice;
    private double currentPrice;

    public Stock(String stoc, String simbolStoc, double closingPrice, double currentPrice) {
        this.stoc = stoc;
        this.simbolStoc = simbolStoc;
        this.closingPrice = closingPrice;
        this.currentPrice = currentPrice;
    }

    public String getStoc() {
        return stoc;
    }

    public String getSimbolStoc() {
        return simbolStoc;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setStoc(String stoc) {
        this.stoc = stoc;
    }

    public void setSimbolStoc(String simbolStoc) {
        this.simbolStoc = simbolStoc;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
