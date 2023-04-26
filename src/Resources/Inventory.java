package Resources;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Product> inventory;

    public Inventory() {
        inventory = new ArrayList<>();

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();

        // Product p1
        p1.setProductName("iPhone 12");
        p1.setDescription("Product Red");
        p1.setPrice(49900);
        p1.setProductId(101);

        // Product p2
        p2.setProductName("iPhone 13");
        p2.setDescription("Midnight Blue");
        p2.setPrice(79900);
        p2.setProductId(102);

        // Product p3
        p2.setProductName("iPhone 13 Pro");
        p3.setDescription("Gold");
        p3.setPrice(105900);
        p3.setProductId(103);

        // Product p4
        p4.setProductName("iPhone 14");
        p4.setDescription("Starlight");
        p4.setPrice(89900);
        p4.setProductId(104);

        // Product p5
        p5.setProductName("iPhone 14 Pro Max");
        p5.setDescription("Deep Purple");
        p5.setPrice(174900);
        p5.setProductId(105);

        inventory.add(0, p1);
        inventory.add(1, p2);
        inventory.add(2, p3);
        inventory.add(3, p4);
        inventory.add(4, p5);
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }
}
