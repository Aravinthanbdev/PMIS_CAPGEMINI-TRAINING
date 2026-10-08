class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.speed = 120;
        c.display();
    }
}
