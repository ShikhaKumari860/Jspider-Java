package numberPG.number;

public class Neon {
    public static void main(String[] args){
        int n=9;
        int s=n*n;
        int sum=0;
        while(s>0){
            int d=s%10;
            sum+=d;
            s/=10;
        }
        if(sum==n){
            System.out.println("neon number");
        }else{
            System.out.println("not neon");
        }
    }
    
}
