package JAVA.Realationship;

public class Relationship2 {
    public static void main(String[] args) {
        Address address = new Address("Chennai", "Tamil Nadu", 600001);
        Student student = new Student("Aravinthan", 101, address);
        student.displayProfile();
    }

    static class Address {
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayAddress() {
        System.out.println(city + ", " + state + " - " + pincode);
    }
}

static class Student {
    String name;
    int rollNumber;
    Address address;

    Student(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    void displayProfile() {
        System.out.println("Student: " + name + "\nRoll No. " + rollNumber);
        System.out.println("Lives at: ");
        address.displayAddress();
    }
}
}
