package Resources;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<Product>();
    }

    public void addItem(Product p) {
        items.add(p);
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product p : items) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
