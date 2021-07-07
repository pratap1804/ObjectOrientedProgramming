import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InventoryMain extends InventoryImplementation {

    public static void main(String[] args){

        InventoryInterface newInventoryItem = new InventoryImplementation();
        Scanner sc = new Scanner(System.in);


        System.out.println("What you wanna do? \n "+ " Option 1 for adding inventory:  \n"+" Option 2 for displaying inventory: ");

        int optionSelected  = sc.nextInt();

        switch (optionSelected)
        {
            case 1:
            System.out.println("How many items you wanna add?");
            int numOfItems = sc.nextInt();
            List<Inventory> items = new ArrayList<>();
            for(int index =0; index< numOfItems; index++) {
                Inventory numberOfInventory = new Inventory();
                System.out.println("Enter item name: ");
                numberOfInventory.setItemName(sc.next());
                System.out.println("Enter Weight: ");
                numberOfInventory.setItemWeight(sc.nextDouble());
                System.out.println("Enter Price per kilogram: ");
                numberOfInventory.setItemPrice(sc.nextDouble());
                newInventoryItem.addInventory(numberOfInventory);
            }
                break;
            case 2:
                System.out.println("Displaying added inventory");
                newInventoryItem.printInventory();
                break;

            case 3:
                System.out.println("Calculate inventory item details: ");
                System.out.println("Enter Total weight and price of the item");
                Scanner scanner = new Scanner(System.in);
                double weight = scanner.nextDouble();
                double price  =scanner.nextDouble();
                newInventoryItem.calculateValue(weight, price);
                break;

            case 4:
                System.out.println("Enter values from 1 to 3! ");
        }
    }
}
