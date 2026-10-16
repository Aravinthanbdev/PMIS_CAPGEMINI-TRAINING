package JAVA.LambdaFunctions;
@FunctionalInterface
interface InnerMultipleLambda {
 void greet(String name);
    
} 
public class MultipleLambda {
    public static void main(String[] args) {
        InnerMultipleLambda greeter = (name) -> System.out.println("Hello, " + name + "!");
        greeter.greet("Aravinthan B");
        greeter.greet("Alice");
        greeter.greet("Bob");
    }
}
