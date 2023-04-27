package Resources;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Product> inventory;
    private ShoppingCart cart;
    private Scanner input;

    public Menu() {
        inventory = new ArrayList<Product>();
        cart = new ShoppingCart();
        input = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nWelcome to our E-commerce store!\n");
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. View Inventory");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove Product from Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    viewInventory();
                    break;
                case 2:
                    addProductToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    removeProductFromCart();
                    break;
                case 5:
                    checkout();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Looks like your cart is empty! Try adding items to checkout.");
        }
        System.out.println("\n---Your Cart---\n");
        double totalCost = 0.0;

    }

    private void viewInventory() {
        inventory = new Inventory().getInventory();
        System.out.println("\nCurrent Inventory:\n");
        System.out.println("ID\tProduct Name\tDescription\tPrice");
        for (Product product : inventory) {
            System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getDescription() + "\t" + product.getPrice());
        }
    }

    private void addProductToCart() {
        System.out.println("\nEnter Product ID to add to cart:");
        int id = input.nextInt();
        boolean found = false;
        //find product
        //add to cart if found

        //if not found display not found
    }

    private void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
        } else {
            System.out.println("\nYour Cart:\n");
            System.out.println("ID\tProduct Name\tDescription\tPrice");
            //display items
        }
    }

    private void removeProductFromCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
        } else {
            System.out.println("\nEnter Product ID to remove from cart:");
            int id = input.nextInt();
            boolean found = false;
            //find product and delete
            if (!found) {
                System.out.println("\nProduct not found in cart.");
            }
        }
    }
}