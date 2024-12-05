/*
James Arnold S. Nieves
October 5, 2024
Class attendance
*/
import java.util.Scanner;

public class Attendance  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the user input how many student are there
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();

        // counter for present and absent student
        int presentCount = 0;
        int absentCount = 0;

        // look through out the attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.next().charAt(0);

            // checking for the if the student is present or absent
            if (attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' && attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input, please enter Y for present or N for absent.");
                i--; // repeat for the same student due to invalid input
            }
        }

        //final count
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);

        
        scanner.close();
    }
}