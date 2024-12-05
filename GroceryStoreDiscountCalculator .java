import java.util.Scanner;

public class GroceryStoreDiscountCalculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the total purchase amount
        System.out.print("Enter the total purchase amount (in PHP): ");
        double totalAmount = scanner.nextDouble();
        
        double discount = 0;
        double finalPrice = totalAmount;

        // Determine the discount based on the total purchase amount
        if (totalAmount < 1000) {
            discount = 0;
        } else if (totalAmount >= 1000 && totalAmount <= 5000) {
            discount = totalAmount * 0.05; // 5% discount
        } else if (totalAmount >= 5001 && totalAmount <= 10000) {
            discount = totalAmount * 0.10; // 10% discount
        } else {
            discount = totalAmount * 0.15; // 15% discount
        }

        // Calculate the final price
        finalPrice = totalAmount - discount;

        // Display the discount and the final price
        System.out.printf("Discount applied: %.0f%%\n", (discount / totalAmount) * 100);
        System.out.printf("Final price after discount: PHP %.2f\n", finalPrice);
        
        // Close the scanner
        scanner.close();
    }
}
