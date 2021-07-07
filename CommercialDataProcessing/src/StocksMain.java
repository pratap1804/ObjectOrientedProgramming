import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StocksMain extends StockCompanyImpl {

    public static void main(String[] args){


        StockCompany stocksItems = new StockCompanyImpl();
        List<StockCompany> stocks = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for what operation you want to perform? \n"+ "" +
                " 1, for buying stocks \n"+
                "2, for selling stocks \n"+" 3, for saving data \n"+" 4, for printing report");
        int operation = scan.nextInt();

        switch (operation){
            case 1:
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Enter a file name: ");
                String fileName = scan1.nextLine();
                StockAccount stockAccount = new StockAccount(fileName);
                stockAccount.setFileName(fileName);
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Enter symbol name and  number of stocks you want to buy:");
                stockAccount.setSymbol(scan2.nextLine());
                stockAccount.setAmount(scan2.nextInt());
                stocks.add(stocksItems);
                stocksItems.buy(scan2.nextInt(), scan2.nextLine());
                stocksItems.toString();
                break;

            case 2:
                Scanner scan3 = new Scanner(System.in);
                System.out.println("Enter a file name: ");
                String fileName1 = scan3.nextLine();
                StockAccount stockAccount1 = new StockAccount(fileName1);
                stockAccount1.setFileName(fileName1);
                Scanner scan4 = new Scanner(System.in);
                System.out.println("Enter symbol and amount of stocks you want to see: ");
                stockAccount1.setSymbol(scan4.nextLine());
                stockAccount1.setAmount(scan4.nextInt());
                stocks.add(stocksItems);
                stocksItems.sell(scan4.nextInt(), scan4.nextLine());
                stocksItems.toString();
                break;

            case 3:
                System.out.println("Saving data: ");
                System.out.println("Enter a file name: ");
                Scanner scan5 = new Scanner(System.in);
                String fileName2 = scan5.nextLine();
                StockAccount stockAccount2 = new StockAccount(fileName2);
                stocksItems.save(fileName2);
                break;

            case 4:
                System.out.println("Printing files: ");
                stocksItems.printReport();

            default:
                System.out.println("Enter a number between 1 -4:");
        }
    }
}
