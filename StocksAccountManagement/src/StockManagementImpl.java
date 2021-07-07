import java.util.ArrayList;
import java.util.List;

public class StockManagementImpl implements StockManager {
    List<Stock> stockLists = new ArrayList<>();

    public void addStocks(Stock stocks){
        if(stockLists.contains(stocks)){
            System.out.println("Stock already exists! ");
        }
        else{
            stockLists.add(stocks);
        }
    }

    public void printStocks(){
        for(Stock stocks : stockLists){
            System.out.println(stocks);
        }
    }

    public void stockValue( int numOfStocks, double pricePerStock){
        for ( Stock stock: stockLists) {
            double totalValue = numOfStocks * pricePerStock;
            System.out.println("Total stock value is: "+totalValue);
        }
    }
}
