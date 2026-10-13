package JAVA.ExceptionHandling;

public class Throws {
    public static void main(String[] args) {
        try {
            int res = divide(10, 0);
            System.out.println(res);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }

    public static int divide(int a, int b) throws java.lang.ArithmeticException {
        return a / b;
    }
}
