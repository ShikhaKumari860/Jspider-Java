package OOPS.methodOverloading;

public class Sum1 {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    
}
class Test1{
    public static void main(String[] args) {
        Sum1 s=new Sum1();
        s.add(10,20);
        s.add(10,20,30);
    }
}
