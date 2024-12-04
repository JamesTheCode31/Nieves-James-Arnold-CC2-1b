/*
James Arnold S. Nieves
October 17, 2024
Final Challege No.3:University Course Enrollment and Grades Tracker 
*/
public class StudentGradeTracker {
    public static void main(String[] args) {
        // Array to store student names
        String[] studentNames = {"Tricia", "Kaye", "James", "Hazel", "Kalvin"};

        // 2D array to store grades for 5 students across 3 subjects
        double[][] grades = {
            {85.5, 90.0, 88.0}, // Tricia's grades
            {88.0, 82.5, 84.0}, // Kaye's grades
            {92.0, 88.5, 91.0}, // James's grades
            {81.0, 90.5, 89.0}, // Hazel's grades
            {89.0, 85.0, 87.5}  // Kalvin's grades
        };

        // Calculate and display each student's average grade
        System.out.println("Student Averages:");
        for (int i = 0; i < studentNames.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = sum / grades[i].length;
            System.out.printf("%s's Average Grade: %.2f%n", studentNames[i], average);
        }
    }
}
