public class VehicleTollCalculator {
    private static class Vehicle {
        protected String registrationNumber;

        public Vehicle(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public double calculateToll() {
            return 50.0;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }
    }

    private static class TollCar extends Vehicle {
        public TollCar(String registrationNumber) {
            super(registrationNumber);
        }

        @Override
        public double calculateToll() {
            return 50.0 + 20.0;
        }
    }

    private static class TollTruck extends Vehicle {
        private int axles;

        public TollTruck(String registrationNumber, int axles) {
            super(registrationNumber);
            this.axles = axles;
        }

        @Override
        public double calculateToll() {
            return 100.0 + (axles * 50.0);
        }
    }

    public static void main(String[] args) {

        Vehicle myCar = new TollCar("MH-04-AB-1234");
        Vehicle myTruck = new TollTruck("MH-43-XY-9999", 4);

        System.out.println(
            "Vehicle: " + myCar.getRegistrationNumber()
            + " | Toll Due: ₹" + myCar.calculateToll()
        );

        System.out.println(
            "Vehicle: " + myTruck.getRegistrationNumber()
            + " | Toll Due: ₹" + myTruck.calculateToll()
        );
    }
}