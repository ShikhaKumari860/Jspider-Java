package numberPG.number;

import java.util.Scanner;

public class AddingTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numuber");
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }

        System.out.println(sum);

    }

}
