import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuItem, quantity;
        double total = 0;

        while (true) {
            // Display the menu
            System.out.println("-----------------------");
            System.out.println("\tMENU");
            System.out.println("-----------------------");
            System.out.println("1. Burger    - PHP 100");
            System.out.println("2. Fries     - PHP 50");
            System.out.println("3. Soda      - PHP 30");
            System.out.println("4. Ice Cream - PHP 45");
            System.out.println("5. Exit");
            System.out.print("\nPlease select an item by entering the corresponding number: ");

            // Get user input for menu selection
            menuItem = scanner.nextInt();

            // Exit condition
            if (menuItem == 5) {
                System.out.println("Thank you for visiting!");
                break;
            }

            // Validate menu selection
            if (menuItem < 1 || menuItem > 5) {
                System.out.println("Invalid selection. Please choose a valid menu item.");
                continue;
            }

            // Get user input for quantity
            System.out.print("\nEnter the quantity: ");
            quantity = scanner.nextInt();

            // Validate quantity input
            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please enter a positive integer.");
                continue;
            }

            // Calculate the total amount based on the selection
            switch (menuItem) {
                case 1:
                    total = 100 * quantity;
                    break;
                case 2:
                    total = 50 * quantity;
                    break;
                case 3:
                    total = 30 * quantity;
                    break;
                case 4:
                    total = 45 * quantity;
                    break;
            }

            // Display the total bill with additional spacing
            System.out.printf("\nThe total bill for your order is: PHP %.2f%n\n", total);
        }

        scanner.close();
    }
}

