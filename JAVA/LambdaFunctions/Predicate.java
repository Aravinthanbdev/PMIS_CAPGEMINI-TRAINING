package JAVA.LambdaFunctions;

public class Predicate {
    public static void main(String[] args) {
        java.util.function.Predicate<Integer> isEven =
                number -> number % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
