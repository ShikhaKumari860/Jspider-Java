package Recursion;

import java.util.Scanner;

public class palind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        
        System.out.println(reverse(n,rev,temp));
        

    }
    static  boolean reverse(int n, int rev,int temp){
        if(n==0) return rev==temp;
        rev=rev*10+(n%10);
        return reverse(n/10, rev, temp);
    }
    
}
