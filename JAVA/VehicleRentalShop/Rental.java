public class Rental {
    private final Vehicle vehicle;
    private final Customer customer;
    private final int days;
    private final double totalCost;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        if (vehicle == null || customer == null) {
            throw new IllegalArgumentException("Vehicle and customer are required");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be greater than zero");
        }

        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = vehicle.calculateRent(days);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
