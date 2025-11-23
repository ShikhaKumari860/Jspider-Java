package numberPG.number;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numuber");
        int n= sc.nextInt();
        int prod=1;
        for(int i=1;i<=n;i++){
            prod*=i;

        }
        System.out.println(prod);
    }
    
}
