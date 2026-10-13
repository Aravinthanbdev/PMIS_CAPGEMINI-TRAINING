package JAVA.ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Do not divide by 0.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
