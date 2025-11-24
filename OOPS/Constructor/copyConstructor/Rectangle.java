package OOPS.Constructor.copyConstructor;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l, int b){
        length=l;
        breadth=b;

    }
    Rectangle(Rectangle r){
        length=r.length;
        breadth=r.breadth;
    }
    void display(){

        System.out.println("length="+length+"breadth="+breadth);
    }
    
}
class test1{
    public static void main(String[] args){
        Rectangle r = new Rectangle(10,20);

        r.display();
        Rectangle r2=new Rectangle(r); // copy Constructor
        r2.display();
    }
}
