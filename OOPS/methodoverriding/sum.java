package OOPS.methodoverriding;

public class sum {
    void add(){
        System.out.println(10+20);
    }
}

    class Sum1 extends sum{
        void add(){
            System.out.println(30+20);
        }
        public static void main(String[] args) {
            Sum1 s = new Sum1();
            s.add();

        }
    }
    

