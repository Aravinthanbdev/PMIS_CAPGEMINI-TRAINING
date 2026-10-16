package JAVA.LambdaFunctions;
@FunctionalInterface 
    interface Greeter {
    void greet(String name);
}
public class Lamda {
    public static void main(String[] args) {
        Greeter greeter = (name) -> System.out.println("Hello, " + name + "!");
        greeter.greet("Aravinthan B");
    }

}