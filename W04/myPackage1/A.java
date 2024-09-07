package myPackage1;

class A {
    A() {
        System.out.println("\n--- Class A (myPackage1) ---");
        X x = new X();  // create an object of class X
        System.out.println("Same package constructor");
        System.out.println("n from A : " + x.n);
        // System.out.println("p from A : " + x.p);    // error
        // System.out.println("q from A : " + x.q);    // error
        System.out.println("r from A : " + x.r);
    }
    
}
