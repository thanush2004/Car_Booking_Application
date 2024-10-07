package CarBooking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;
    private List<Booking> bookingList;
    private int nextBookingId;

    public CarService() {
        carList = new ArrayList<>();
        bookingList = new ArrayList<>();
        nextBookingId = 1;
        initializeCars();
    }

    private void initializeCars() {
        carList.add(new Car(1, "Toyota Corolla"));
        carList.add(new Car(2, "Honda Civic"));
        carList.add(new Car(3, "Ford Focus"));
        carList.add(new Car(4, "Chevrolet Malibu"));
        carList.add(new Car(5, "Nissan Altima"));
        carList.add(new Car(6, "Hyundai Elantra"));
        carList.add(new Car(7, "Volkswagen Jetta"));
        carList.add(new Car(8, "Subaru Impreza"));
        carList.add(new Car(9, "Kia Forte"));
        carList.add(new Car(10, "Mazda 3"));
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public boolean bookCar(int carId) {
        Car car = findCarById(carId);
        if (car != null && car.isAvailable()) {
            car.setAvailable(false);
            Booking booking = new Booking(nextBookingId++, car, LocalDate.now());
            bookingList.add(booking);
            System.out.println("Booking Successful: " + booking);
            return true;
        }
        System.out.println("Car not available for booking.");
        return false;
    }

    private Car findCarById(int carId) {
        for (Car car : carList) {
            if (car.getId() == carId) {
                return car;
            }
        }
        return null;
    }

    public List<Booking> getAllBookings() {
        return bookingList;
    }
}
