package JAVA.Generics;

// Generic method
class Util {

    static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    static <T> T firstOf(T a, T b) {
        return b;
    }
}

class gen {
    public static void main(String[] args) {
        Util.printTwice(10);
        System.out.println(Util.firstOf("Hi", "Hello"));
    }
}