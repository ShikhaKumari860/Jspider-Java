package OOPS.Constructor.ConstructorOverloading;

public class box {
    int height;
    int length;
    int width;

    box(int h,int l,int w){;

        height=h; 
        length=l;
        width=w;
    }

    box(int d){
        height=d;
        length=d;
        width=d;
    }
    void display(){
        System.out.println("height =  "+height+"  length =  "+ length + "  width =  " + width);
    }

    
        public static void main(String[] args){
            box b = new box(50,20,30);
            b.display();
        }
    }
    
