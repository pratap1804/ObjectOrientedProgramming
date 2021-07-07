import java.util.ArrayList;
import java.util.List;

public class StockCompanyImpl implements StockCompany {

    List<StockCompany> stocks = new ArrayList<>();

    @Override
    public void buy(int amount, String symbol)
    {
        int boughtStocks = amount;
        System.out.println("Bought"+boughtStocks+" of "+symbol);
    }

    @Override
    public void sell(int amount, String symbol)
    {
        int soldStocks = amount;
        System.out.println("Sold"+soldStocks+" of "+symbol);
    }

    @Override
    public void save(String fileName) {
    for(StockCompany item : stocks)
    {
        stocks.add(item);
        }
    }

    @Override
    public void printReport()
    {
    System.out.println(stocks);
    }

}
