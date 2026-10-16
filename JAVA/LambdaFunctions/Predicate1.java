package JAVA.LambdaFunctions;
import java.util.function.Predicate;
import java.util.*;
public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
