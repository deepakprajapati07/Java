package myPackage1;

public class Y extends X{

    public Y() {
        System.out.println("\n--- Class Y (myPackage1) ---");
        System.out.println("I am constructor from class Y");
        System.out.println("n : " + n);
        // System.out.println("p : " + p);
        // p is a private member of X. Not accessible outside X
        System.out.println("q : " + q); // protected is accessible
        System.out.println("r : " + r); // public is accessible
    }
    
}
