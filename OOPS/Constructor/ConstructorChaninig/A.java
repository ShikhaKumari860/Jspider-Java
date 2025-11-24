package OOPS.Constructor.ConstructorChaninig;

public class A {
    int a;
    A(){
        this(1);
        System.out.println(80);

    }
    A(int a){
        System.out.println(70);

    }
    
}
class B extends A{
    B(){
        this(1);
        System.out.println(10+20);

    }
    B(int a){
        System.out.println(10+80);

    }
}

class  C{
    public static void main(String[] args){
        B b = new B();

    }
}
