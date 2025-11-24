package Arrays;
import java.util.Arrays;
public class MoveZero {
    public static void main(String[] args) {
        int[] a={2,0,1,5,8,0,3,0};
        int  i=0;
        int j=a.length-1;

        
        while(i<j){
            if(a[i] >a[j]){
                i++;
            }else if(a[i]<a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            

            }
            System.out.println(Arrays.toString(a));
        }
    }
    

