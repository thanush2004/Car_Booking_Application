package CarBooking;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private Car car;
    private LocalDate bookingDate;

    public Booking(int bookingId, Car car, LocalDate bookingDate) {
        this.bookingId = bookingId;
        this.car = car;
        this.bookingDate = bookingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Car: " + car.getName() + ", Date: " + bookingDate;
    }
}
