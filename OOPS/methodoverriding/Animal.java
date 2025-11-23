package OOPS.methodoverriding;

public class Animal {
    void sound(){

    }
    
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bow-Bow");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("meow-meow");
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}

