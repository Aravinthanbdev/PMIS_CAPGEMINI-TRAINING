// Hierarchical Inheritance

// Common Parent
class Shape {
    String color = "Blue";
}

// Child - 1
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a " + color + " circle");
    }
}

// Child - 2
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a " + color + " rectangle.");
    }
}

public class Hierarchical  {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.drawCircle();
        r.drawRectangle();
    }
}