public interface StockCompany {

    void buy(int amount, String symbol);
    void sell(int amount, String symbol);
    void save(String fileName);
    void printReport();
}
