public abstract class Vehicle implements Rentable {
    private final String id;
    private final String model;
    private final double dailyRate;
    private boolean available;

    public Vehicle(String id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDisplayName() {
        return getClass().getSimpleName() + " " + model + " (" + id + ")";
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}
