class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.name = "Tommy";

        System.out.println(d.name);
        d.eat();
        d.bark();
    }
}
