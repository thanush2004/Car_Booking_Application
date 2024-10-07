package CarBooking;

import java.time.LocalDate;

public class Car {
    private int id;
    private String name;
    private boolean available;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car ID: " + id + ", Name: " + name + ", Available: " + (available ? "Yes" : "No");
    }
}
