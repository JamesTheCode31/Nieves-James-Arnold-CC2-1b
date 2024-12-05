/*
 *James Arnold S. Nieves
 *Semtepber 23, 2024
 *Laboratory Challenge No.3
*/

import java.util.Scanner;

public class LaboratoryChallengeNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first item	
        System.out.print("Enter the price of item 1: ");
        double price1 = scanner.nextDouble();// Taking price input for item 1
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = scanner.nextInt(); // Taking quantity input for item 1

        // Input for the second item
        System.out.print("Enter the price of item 2: ")	;
        double price2 = scanner.nextDouble();// Taking price input for item 2
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = scanner.nextInt();// Taking quantity input for item 2

        // Input for the third item
        System.out.print("Enter the price of item 3: ");
        double price3 = scanner.nextDouble();// Taking price input for item 3
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = scanner.nextInt();// Taking quantity input for item 3

        // Calculating subtotal by multiplying prices by quantities for each item
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        
        // Calculating 5% discount on the subtotal
        double discount = subtotal * 0.05;
        
        // Subtracting the discount from the subtotal to get the discounted total
        double discountedTotal = subtotal - discount;
       
        // Calculating 12% sales tax on the discounted total
        double salesTax = discountedTotal * 0.12;
        
        // Adding the sales tax to the discounted total to get the final amount
        double finalTotal = discountedTotal + salesTax;

        // Output with formatted values to two decimal places
        System.out.printf("\nSubtotal   : PHP %.2f", subtotal);
        System.out.printf("\nDiscount   : PHP %.2f", discount);
        System.out.printf("\nSales Tax  : PHP %.2f", salesTax);
        System.out.printf("\nFinal Total: PHP %.2f\n", finalTotal);
    }
}

