import Resources.Inventory;
import Resources.Product;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // creating inventory
        Inventory i = new Inventory();
        ArrayList<Product> myInventory;
        myInventory = i.getInventory();

        System.out.println(myInventory.get(1).getProductName());
    }
}
