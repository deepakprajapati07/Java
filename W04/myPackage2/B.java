package myPackage2;

public class B {
    B() {
        System.out.println("\n--- Class B (myPackage2) ---");
        myPackage1.X x = new myPackage1.X();
        // create an object of class X
        System.out.println("I am a constructor from class B of MyPackage2");
        // System.out.println("n from B of MyPackage2 : " + x.n);  // default variable is not accessible here
        // System.out.println("p from B : " + x.p);    // error
        // System.out.println("q from B : " + x.q);    // error
        System.out.println("r from B : " + x.r);
    }
}
