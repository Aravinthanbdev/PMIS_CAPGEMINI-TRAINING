public class Car extends Vehicle {
    public Car(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        validateDays(days);
        return getDailyRate() * days;
    }

    protected void validateDays(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be greater than zero");
        }
    }
}
