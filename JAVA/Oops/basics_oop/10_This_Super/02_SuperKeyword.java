class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
