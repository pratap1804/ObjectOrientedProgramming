public class Stock {
    private String stockCompanyName;
    private int numOfStocks;
    private double pricePerStock;

    public Stock(String stockCompanyName, int numOfStocks, double pricePerStock) {
        this.stockCompanyName = stockCompanyName;
        this.numOfStocks = numOfStocks;
        this.pricePerStock = pricePerStock;
    }

    public Stock() {

    }


    public String getStockCompanyName() {
        return stockCompanyName;
    }

    public void setStockCompanyName(String stockCompanyName) {
        this.stockCompanyName = stockCompanyName;
    }

    public int getNumOfStocks() {
        if(numOfStocks <= 0){
            System.err.println("Stock amount cannot be less than or equal to zero! ");
        }
        return numOfStocks;
    }

    public void setNumOfStocks(int numOfStocks) {
        this.numOfStocks = numOfStocks;
    }

    public double getPricePerStock() {
        if(pricePerStock <= 0){
            System.err.println("Price of a stock cannot be less than or equal to zero! ");
        }
        return pricePerStock;
    }

    public void setPricePerStock(double pricePerStock) {
        this.pricePerStock = pricePerStock;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockCompanyName='" + stockCompanyName + '\'' + ", numOfStocks=" + numOfStocks + ", pricePerStock=" + pricePerStock + '}';
    }
}
