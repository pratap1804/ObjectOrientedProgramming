import java.util.List;

public class Inventory {
    private String itemName;
    private double itemWeight;
    private double itemPrice;

    public Inventory(String itemName, double itemWeight, double itemPrice, double totalPrice) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.itemPrice = itemPrice;
    }

    public Inventory() {

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemWeight() {
        if(getItemWeight() <= 0){
            System.err.println("Weight Cannot be less than or equal to zero!");
        }
        return itemWeight;
    }

    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public double getItemPrice() {
        if(getItemPrice() <=0){
            System.err.println("Price cannot be less than or equal to zero! ");
        }
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemName='" + itemName + '\'' + ", itemWeight=" + itemWeight + ", itemPrice=" + itemPrice + '}';
    }
}
