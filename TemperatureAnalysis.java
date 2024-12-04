/*
James Arnold S. Nieves
October 16, 2024
Final Challege No.2:Weather Data Tracker 
*/
public class TemperatureAnalysis {
    public static void main(String[] args) {
        // Temperature data: 3 cities (rows) over 7 days (columns)
        double[][] temperatures = {
            {30.5, 32.0, 31.2, 29.8, 28.5, 30.0, 31.5}, // City 1
            {25.0, 26.5, 24.8, 27.2, 28.0, 25.5, 26.0}, // City 2
            {35.0, 36.5, 37.0, 35.5, 34.8, 33.2, 36.0}  // City 3
        };

        // Calculate the average temperature and highest temperature for each city
        for (int city = 0; city < temperatures.length; city++) {
            double sum = 0;
            double highest = temperatures[city][0];

            for (int day = 0; day < temperatures[city].length; day++) {
                sum += temperatures[city][day];
                if (temperatures[city][day] > highest) {
                    highest = temperatures[city][day];
                }
            }

            double average = sum / temperatures[city].length;

            // Display results for the current city
            System.out.printf("City %d:%n", city + 1);
            System.out.printf("  Average Temperature: %.2f°C%n", average);
            System.out.printf("  Highest Temperature: %.2f°C%n", highest);
        }
    }
}
