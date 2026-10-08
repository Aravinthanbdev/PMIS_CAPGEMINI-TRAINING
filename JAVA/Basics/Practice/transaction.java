import java.util.*;
public class transaction {
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        String [] b = new String[n];
        String [] c = new String[n];
        int [] d =new int[n];
        int [] e = new int[n];
        for ( int i =0;i<n;i++){
            b[i] = a.next();
            c[i] = a.next();
            d[i] = a.nextInt();
            e[i] = a.nextInt();
        }
        for (int i=0;i<n;i++){
            for ( int j=i+1;j<n;j++){
                if(b[i].equals(b[j]) && c[i].equals(c[j])){
                    System.out.println("error duplication transaction");
                    return;
                }
            }
        }
        for (int i=1;i<n;i++){
            if(d[i] - d[i-1] > 60){
                System.out.println("fraud detected");
                return;
            }
        }
        System.out.println("all transaction are valid");
       

        }
}
