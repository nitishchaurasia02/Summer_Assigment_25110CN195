import java.util.*;
class Program_116 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> inventory = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Search Product");
            System.out.println("4. Update Stock Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayInventory();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    updateStock();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Initial Quantity: ");
        int quantity = sc.nextInt();
        inventory.add(new Product(id, name, price, quantity));
        System.out.println("Product added successfully.");
    }
    static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nCurrent Inventory Stock:");
            for (Product p : inventory) {
                p.display();
            }
        }
    }
    static void searchProduct() {
        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Product p : inventory) {
            if (p.id == id) {
                p.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }
    static void updateStock() {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Product p : inventory) {
            if (p.id == id) {
                System.out.print("Enter new quantity: ");
                p.quantity = sc.nextInt();
                System.out.println("Stock updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }
    static class Product {
        int id;
        String name;
        double price;
        int quantity;
        Product(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        void display() {
            System.out.println("---------------------------------");
            System.out.println("Product ID : " + id);
            System.out.println("Name       : " + name);
            System.out.println("Price      : " + price);
            System.out.println("Quantity   : " + quantity);
        }
    }
}