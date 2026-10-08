import java.util.*;
public class GYM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 0) {
            System.out.println("Invalid Input");
        }
        else if (value == 1){
            System.out.println("2000");

        }
        else if (value == 2 || value == 3){
            System.out.println("5000");
        }
        else if ( value == 4 || value == 5 || value == 6){
            System.out.println("9000");
        }
        else if (value == 9){
            System.out.println("12000");
        }
        else if (value == 12){
            System.out.println("15000");
        }
        else {
            System.out.println("Error");
        }
        scanner.close();
    }
}
