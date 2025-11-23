package numberPG.number;

import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numuber");
        int n = sc.nextInt();

        int sum = 0;
        int temp=n;

        while (n > 0) {
            int d = n % 10;
            int prod = 1;
            for (int i = 1; i <= d; i++) {
                prod *= i;
            }
            n /= 10;
            sum += prod;

        }
        if(sum==temp){
        System.out.println("strong no");
        }else{
            System.out.println("not strong number");
        }

    }
}
