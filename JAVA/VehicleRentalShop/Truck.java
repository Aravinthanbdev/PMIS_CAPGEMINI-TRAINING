public class Truck extends Vehicle {
    private static final double INSURANCE_CHARGE = 500.0;

    public Truck(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be greater than zero");
        }
        return getDailyRate() * days + INSURANCE_CHARGE;
    }
}
