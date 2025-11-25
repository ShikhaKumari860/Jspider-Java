package pattern;

public class automarphic {
    public static void main(String[] args) {
        int n=25;
        int s=n*n;
        

        System.out.println(Automarphic(n,s));

        
    }
    static boolean Automarphic(int n ,int s){
        if(n==0) return true;
        if(n%10!=s%10) return false;
        return Automarphic(n/10, s/10);

    }
    
}
