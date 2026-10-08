class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
