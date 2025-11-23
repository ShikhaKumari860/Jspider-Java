package OOPS.inheritance.Hierarchical;

public class Bank {
    String loc = "Marathahalli";
    int pincode = 560037;
}

class SBI extends Bank {
    double ROI = 6.7;
    String IFSC = "abcd123";

    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println(s.ROI);
        System.out.println(s.IFSC);
        System.out.println(s.loc);
        System.out.println(s.pincode);
    }
}

class PNB extends Bank {
    double ROI = 3.4;
    String IFSC = "shwjg283";

    public static void main(String[] args) {

        PNB p = new PNB();
        System.out.println(p.pincode);
        System.out.println(p.loc);
        System.out.println(p.ROI);
        System.out.println(p.IFSC);


    }
}