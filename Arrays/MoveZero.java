package Arrays;
import java.util.Arrays;
public class MoveZero {
    public static void main(String[] args) {
        int[] a={0,2,0,1,5,8,0,3,0};
        int  i=0;
        int j=a.length-1;
        while(i<j){
            while(a[i]!=0) i++;
            while(a[j] == 0) j--;
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.println(Arrays.toString(a));

        
        
            
            
          
        }
    }
    

