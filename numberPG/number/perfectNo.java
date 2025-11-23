package numberPG.number;

import java.util.Scanner;

public class perfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numuber");
        int n = sc.nextInt();


        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }

        }
        if(sum==n){
            System.out.println("perfect no");
        }else{
            System.out.println("not perfect");
        }
    }

}


