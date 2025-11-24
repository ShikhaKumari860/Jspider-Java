package OOPS.Constructor.ConstructorChaninig;


    public class chain{
    chain(){
        this(2);
        System.out.println(10);

    }
    chain(int a){
        this(1.1);
        System.out.println(10+20);
    }
    chain(double b){
        System.out.println(40+57);
    }
    public static void main(String[] args){
        chain c= new chain();

    }
    
}
    

