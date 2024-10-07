package CarBooking;

import java.util.*;

public class CarServiceApp {
    public static void main(String[] args) {
        CarService carService = new CarService();
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Car Booking Service!");
            System.out.println("1. View Available Cars");
            System.out.println("2. Book a Car");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");

            int choice = InputUtility.readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    System.out.println("Available Cars:");
                    for (Car car : carService.getAvailableCars()) {
                        System.out.println(car);
                    }
                    break;
                case 2:
                    int carId = InputUtility.readInt("Enter Car ID to book: ");
                    carService.bookCar(carId);
                    break;
                case 3:
                    System.out.println("All Bookings:");
                    for (Booking booking : carService.getAllBookings()) {
                        System.out.println(booking);
                    }
                    break;
                case 4:
                    System.out.println("Exiting application. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        InputUtility.closeScanner();
    }
}
