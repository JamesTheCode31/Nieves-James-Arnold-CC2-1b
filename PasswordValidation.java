/*
James Arnold S. Nieves
October 5, 2024
Password validation
*/
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        // loop asking the user to put a valid password
        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            // Check if the password has at least 8 characters
            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
                System.out.println("Please try again.");
                continue;  // Go to the next iteration of the loop
            }

            // check if the password contains at least one number
            if (!password.matches(".*\\d.*")) {
                System.out.println("Password must contain at least one number.");
                System.out.println("Please try again.");
                continue;  // Go to the next iteration of the loop
            }

            // check if the password contains one uppercase letter
            if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password must contain at least one uppercase letter.");
                System.out.println("Please try again.");
                continue;  // Go to the next iteration of the loop
            }

            // the password is valid when the password of user is valid to the code
            System.out.println("Your password is valid!");
            break;  // Exit the loop if the password is valid
        }

        scanner.close();  
    }
}