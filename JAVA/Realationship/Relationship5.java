abstract class Shape {
    private String colour;

    void setColor(String colour) {
        this.colour = colour;
    }

    String getcolor() {
        return colour;
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (3.14) * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class Relationship5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("Red");
        System.out.println("Circle color: " + circle.getcolor());
        System.out.println("Circle area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setColor("Blue");
        System.out.println("Rectangle color: " + rectangle.getcolor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}