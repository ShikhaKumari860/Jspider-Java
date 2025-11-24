package numberPG.number;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 5;
        int c = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
