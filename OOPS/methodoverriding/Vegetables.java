package OOPS.methodoverriding;

public class Vegetables {
    void dish(){

    }
    void nutrition(){

    }
    
}

class Potato extends Vegetables{
    @Override
    void dish(){
        System.out.println("potato fry");
    }
    void nutrition(){
        System.out.println("vitamin A 40%");
        System.out.println("Vitamin d 70%");
    }
}
class Carrot extends Vegetables{
    @Override
    void dish(){
        System.out.println("halwa");
    }
    void nutrition(){
        System.out.println("vitamin 60%");
    }
}
class test2{
    public static void main(String[] args) {
        Carrot c= new Carrot();
        c.dish();
        c.nutrition();
        System.out.println("-------------------");

        Potato p =new Potato();
        p.dish();
        p.nutrition();

    }
}
