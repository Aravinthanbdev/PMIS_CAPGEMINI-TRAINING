package JAVA.LambdaFunctions;
import java.util.function.Supplier;
public class Square {
    public static void main(String[] args) {
        Supplier<Integer> squareCalculator = () -> 5 * 5;

        int number = 5;
        int square = squareCalculator.get();
        System.out.println("The square of " + number + " is: " + square);
    }
}
