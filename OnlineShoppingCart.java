/*
 *James Arnold S. Nieves
 *December 4, 2024
 *Exception Handling Laboratory Challenges
 */
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void purchase(int quantity) throws InvalidQuantityException {
        if (quantity < 0) {
            throw new InvalidQuantityException("Invalid quantity. Quantity cannot be negative.");
        } else if (quantity > stock) {
            throw new InvalidQuantityException("Invalid quantity. Only " + stock + " items are available in stock.");
        }
        stock -= quantity;
        System.out.println("Purchase successful! Remaining stock: " + stock);
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product("Laptop", 5); // Example product with 5 items in stock

        System.out.println("Welcome to the Online Shopping Cart!");
        System.out.println("Product: " + product.getName());
        System.out.println("Available stock: " + product.getStock());

        try {
            System.out.print("Enter quantity to purchase: ");
            int quantity = scanner.nextInt();
            product.purchase(quantity);
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for shopping with us!");
        }

        scanner.close();
    }
}
