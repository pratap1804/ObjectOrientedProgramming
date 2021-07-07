public class StockAccount {
    String fileName;
    String symbol;
    int amount;

    public StockAccount(String fileName, String symbol, int amount) {
        this.fileName = fileName;
        this.symbol = symbol;
        this.amount = amount;
    }

    public StockAccount(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "StockAccount{" + "fileName='" + fileName + '\'' + ", symbol='" + symbol + '\'' + ", amount=" + amount + '}';
    }
}
