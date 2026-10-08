import java.util.*;
public class speed{
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        double d = a.nextDouble();
        double t =a.nextDouble();
        if(d<=0){
            System.out.println("Erorr");
        }
        else{
            double s = (d/t)*3.6;
            System.out.println(s);
        }
    }
}