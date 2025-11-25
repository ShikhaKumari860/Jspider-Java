package numberPG.number;

public class prime {
    public static void main(String[] args) {
        int n=7;
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
                
            }
        }
        if(flag && n>=2){
            System.out.println("prime nuumber");
        }else{
            System.out.println("not prime");
        }
        
    }
    
}
