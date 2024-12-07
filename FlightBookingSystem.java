/*
 *James Arnold Nieves
 *December 4, 2024
 *Exception Handling Laboratory Challenges
 */
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

// Flight Class
class Flight {
    private final String flightNumber; // Unique identifier for the flight
    private final int totalSeats;     // Total seats available
    private int bookedSeats;          // Currently booked seats

    // Constructor to initialize flight details
    public Flight(String flightNumber, int totalSeats) {
        this.flightNumber = flightNumber;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    // Method to book a seat
    public void bookSeat() throws NoSeatsAvailableException {
        if (bookedSeats >= totalSeats) {
            throw new NoSeatsAvailableException("No seats available on flight " + flightNumber + ".");
        }
        bookedSeats++;
        System.out.println("Seat booked successfully on flight " + flightNumber + ".");
    }

    // Method to retrieve available seats
    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    // Getter for flightNumber
    public String getFlightNumber() {
        return flightNumber;
    }
}

// Main class to simulate the flight booking system
public class FlightBookingSystem {
    public static void main(String[] args) {
        // Initialize the flight with a flight number and total seats
        Flight flight = new Flight("FL123", 2);

        // Attempt to book seats more times than available
        for (int attempt = 1; attempt <= 4; attempt++) {
            System.out.println("Attempting to book seat " + attempt + "...");
            try {
                flight.bookSeat();
            } catch (NoSeatsAvailableException e) {
                System.err.println("Error: " + e.getMessage());
            }
            System.out.println("Available seats after attempt " + attempt + ": " + flight.getAvailableSeats());
        }

        // Display final status of available seats
        System.out.println("Final available seats on flight " + flight.getFlightNumber() + ": " + flight.getAvailableSeats());
    }
}

