package Recursion.number;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter decimal number");

        int n=sc.nextInt();
        getBinary(n);
    }
    static void getBinary(int n){
        if(n<1) return;
        int d=n%2;
        getBinary(n/2);
        System.out.print(d);
    }

    
}
