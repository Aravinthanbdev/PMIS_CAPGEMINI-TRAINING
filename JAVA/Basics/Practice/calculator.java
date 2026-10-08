import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double c = a.nextDouble();
        double discount ;
        if (c < 1000){
            discount = 0.05;
        }
        else if (c<5000){
            discount = 0.10;
        }
        else{
            discount = 0.15;
        }
        double final_price = c - (c*discount);
        System.out.printf("%.2f%n", final_price);
        a.close();

    }  
}
