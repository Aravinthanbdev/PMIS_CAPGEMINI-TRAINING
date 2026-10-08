class Car1 {
    String color;
    String Brand;
    int speed;

    Car1(String color, String Brand, int speed) {
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println(Brand + "\n" + color + "\n" + speed);
    }

    void accelerate(int incr) {
        int or_speed = speed;
        speed += incr;

        System.out.println("Original Speed: " + or_speed);
        System.out.println(Brand + " accelerated by " + speed + " Km/hr");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Blue", "BMW", 360);
        c1.displayInfo();
        c1.accelerate(50);
    }
}