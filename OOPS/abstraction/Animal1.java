package OOPS.abstraction;

abstract class Animal1 {
    abstract void makeSound();
}

class Cat extends Animal1{
    @Override
    void makeSound(){
        System.out.println("meow");
    }
}
class Dog extends Animal1{
    @Override
    void makeSound(){
        System.out.println("bow");
    }
}

class Lion extends Animal1{
    @Override
    void makeSound(){
        System.out.println("roar");
    }
}

class Hospital{
    void vaccination(Animal1 a){
        System.out.println("vaccination");
        a.makeSound();
    }
}

class Test{
    public static void main(String[] args) {
        Hospital h = new Hospital();

        h.vaccination(new Cat());
        h.vaccination(new Dog());
        h.vaccination(new Lion());
    }
}




