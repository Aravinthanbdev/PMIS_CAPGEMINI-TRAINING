package JAVA.ExceptionHandling;

public class ArithmeticException {
class exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int rest = a / b;
            System.out.println(rest);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("You cannot divide by 0.");
        }
    }
}
}