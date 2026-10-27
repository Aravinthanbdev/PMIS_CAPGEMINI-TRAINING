import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RentalShop {
    private final List<Vehicle> fleet = new ArrayList<>();
    private final List<Rental> activeRentals = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle " + vehicleId + " not found");
        }
        if (!vehicle.isAvailable()) {
            throw new IllegalStateException(vehicle.getDisplayName() + " is already rented");
        }

        Rental rental = new Rental(vehicle, customer, days);
        vehicle.setAvailable(false);
        activeRentals.add(rental);
        customer.addRental(rental);
        System.out.printf("%s rented %s for %d days = %.2f%n",
                customer.getName(), vehicle.getDisplayName(), days, rental.getTotalCost());
        return rental;
    }

    public void giveBack(String vehicleId) {
        Vehicle vehicle = findVehicle(vehicleId);
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle " + vehicleId + " not found");
        }
        if (vehicle.isAvailable()) {
            throw new IllegalStateException(vehicle.getDisplayName() + " is not currently rented");
        }

        vehicle.setAvailable(true);
        activeRentals.removeIf(rental -> rental.getVehicle().getId().equals(vehicleId));
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle.getDisplayName());
            }
        }
    }

    public List<Vehicle> getFleet() {
        return Collections.unmodifiableList(fleet);
    }

    private Vehicle findVehicle(String id) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }
        return null;
    }
}
