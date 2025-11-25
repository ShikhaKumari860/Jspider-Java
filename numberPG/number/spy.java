package numberPG.number;

public class spy {
    public static void main(String[] args) {
        int n=3;
        int prod=1;
        int sum=0;
        while (n > 0){
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        if(sum==prod){
            System.out.println("spy number");
        }else{
            System.out.println("not number");
        }
    }
    
}
