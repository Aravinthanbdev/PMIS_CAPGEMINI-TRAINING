public class Bike extends Vehicle {
    public Bike(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be greater than zero");
        }

        double total = getDailyRate() * days;
        if (days >= 7) {
            total *= 0.90;
        }
        return total;
    }
}
