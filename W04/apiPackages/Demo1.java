// Accessing a package from a Java built-in APIs

// import java.lang.*; // Math class is defined in this package

class Calculator {
    double i;
    double x;
    void p() {
        x = Math.sqrt(i);
    }
}

public class Demo1 {

    public static void main(String args[]) {
        Calculator a = new Calculator();
        a.i = 20.0;
        a.p();
        System.out.println("Square root of " + a.i + " : " + a.x);
    }

}