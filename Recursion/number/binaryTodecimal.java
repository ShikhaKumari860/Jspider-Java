package Recursion.number;

import java.util.Scanner;

public class binaryTodecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter binary number");
        int n=sc.nextInt();

        int sum=0;
        int prod=1;

        System.out.println(getDecimal(n,sum,prod));
    }
    static int getDecimal(int n, int sum, int prod){
        if(n==0) return sum;
        sum+=prod*(n%10);
        return getDecimal(n/10, sum, prod*2);
    }

}
