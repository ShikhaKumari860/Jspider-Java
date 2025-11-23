package OOPS.methodOverloading;

public class Sum {


    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }
}
class Test{
    public static void main(String[] args) {
        Sum.add(10, 20, 30);
        Sum.add(2.0, 3.0);
        Sum.add(10, 20);
    }
}
