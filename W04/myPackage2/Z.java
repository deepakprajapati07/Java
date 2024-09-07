package myPackage2;

public class Z extends myPackage1.X{
    Z() {
        System.out.println("\n--- Class Z (myPackage2) ---");
        System.out.println("I am a constructor from class Z");
        // System.out.println("n from Z : " + n);  // error
        // Default is not accessible outside package
        // System.out.println("p from Z : " + p);  //error, private is not accessible
        System.out.println("q from Z : " + q);  // protected member is accessible by inheritance
        System.out.println("r from Z : " + r);  // public is accessible
    }
    
}
