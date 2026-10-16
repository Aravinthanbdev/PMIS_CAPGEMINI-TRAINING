
package JAVA.LambdaFunctions;

public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<String> printer = message -> System.out.println(message);
        printer.accept("Hello, Aravinthan B!");
    }
}
