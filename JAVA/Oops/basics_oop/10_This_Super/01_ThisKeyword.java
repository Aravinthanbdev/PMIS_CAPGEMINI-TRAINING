class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student s = new Student("Aravinthan");
        s.display();
    }
}
