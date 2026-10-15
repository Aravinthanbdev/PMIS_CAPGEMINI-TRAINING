package JAVA.Realationship;

class Student {
    String name;
    static String collegeName = "IIT Bombay";

    Student(String name) {
        this.name = name;
    }

    void stuCol() {
        System.out.println(name + " studies in " + collegeName);
    }
}

public class Relationship4 {
    public static void main(String[] args) {
        Student s1 = new Student("Aravinthan");
        Student s2 = new Student("Rahul");

        s1.stuCol();
        s2.stuCol();
    }
}