package JAVA.LambdaFunctions;
import java.util.function.Function;
public class length {
    public static void main(String[] args) {
        Function<String, Integer> nameLength = name -> name.length();
        System.out.println("Length of 'Aravinthan B': " + nameLength.apply("Aravinthan B"));
    }
}
