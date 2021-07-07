import java.util.Scanner;

public class StocksMain {

    public static void main(String[] args){

        StockManager newStockAccount = new StockManagementImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for adding stock details \n"+"Enter 2 for printing total stock values \n");
        int option = sc.nextInt();


        switch(option)
        {
            case 1:
                System.out.println("For how many companies you want stocks: ");
                int numOfCompanies = sc.nextInt();

                for(int index = 0; index<numOfCompanies; index++)
                {
                    Stock newStocks = new Stock();
                    System.out.println("Enter company name : ");
                    newStocks.setStockCompanyName(sc.next());
                    System.out.println("Enter how many stocks you want to buy?");
                    newStocks.setNumOfStocks(sc.nextInt());
                    System.out.println("Enter price per stock: ");
                    newStocks.setPricePerStock(sc.nextInt());
                    newStockAccount.addStocks(newStocks);
                }
                break;

            case 2:
                newStockAccount.printStocks();
                break;

            case 3:
                System.out.println("Enter Number of stocks and price per stock: ");
                Scanner scanner = new Scanner(System.in);
                int numberOfStocks = scanner.nextInt();
                double pricePerStock = scanner.nextDouble();
                newStockAccount.stockValue(numberOfStocks, pricePerStock);
                break;

            default:
                System.out.println("Enter values from 1 to 3! ");
        }

    }
}
