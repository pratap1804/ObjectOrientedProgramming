import java.util.ArrayList;
import java.util.List;

public class InventoryImplementation implements InventoryInterface{

    List<Inventory> newItems = new ArrayList<>();

    @Override
    public void addInventory(Inventory item)
    {
        if(newItems.contains(item))
        {
            System.out.println("Inventory already exists! ");
        } else
        {
          newItems.add(item);
        }
    }

    @Override
    public void printInventory() {
        for(Inventory items : newItems)
        {
            System.out.println(toString());
        }
    }

    @Override
    public void calculateValue(double itemWeight, double itemPrice) {
        for (Inventory item: newItems)
        {
            double totalValue = itemPrice* itemWeight;
            System.out.println("Total stock value is: "+totalValue);
        }
    }
}
