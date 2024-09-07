/*
    Define a class Complex to represent an object for a complex number like Z = X + i.Y with the following methods:

    Complex add(Complex z1, Complex z2) //To add two complex numbers
    Complex sub(Complex z1, Complex z2) //To subtract two complex numbers
    Complex mul(Complex z1, Complex z2) // To multiply two complex numbers
    float magnitude(Complex z) // To find the modulus
    Complex conjugate(Complex z) // To find the complex conjugate

    Write the main class and instantiate the objects of the above mentioned classes.

*/

class Complex {
    double real;
    double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add complex numbers
    public static Complex add(Complex z1, Complex z2) {
        double realSum = z1.real + z2.real;
        double imgSum = z1.imaginary + z2.imaginary;

        return new Complex(realSum, imgSum);
    }

    // Method to subtract two complex numbers
    public static Complex sub(Complex z1, Complex z2) {
        double realSub = z1.real - z2.real;
        double imgSub = z1.imaginary - z2.imaginary;

        return new Complex(realSub, imgSub);
    }

    // Method to multiply two complex numbers
    public static Complex mul(Complex z1, Complex z2) {
        double realProduct = (z1.real * z2.real) - (z1.imaginary * z2.imaginary);
        double imgProduct = (z1.real * z2.imaginary) + (z1.imaginary * z2.real);

        return new Complex(realProduct, imgProduct);
    }

    // Method to find the modulus (magnitude) of a complex number
    public static double magnitude(Complex z) {
        return Math.sqrt((z.real * z.real) + (z.imaginary * z.imaginary));
    }

    // Method to display the complex conjugate of a complex number
    public static Complex conjugate(Complex z) {
        return new Complex(z.real, -z.imaginary);
    }

    // Method to display the complex number
    @Override
    public String toString() {
        return real + " " + imaginary + "i";
    }
}

public class p02 {

    public static void main(String args[]) {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, -2);

        System.out.println();
        System.out.println("z1 : " + z1);
        System.out.println("z2 : " + z2);

        // Add
        Complex sum = Complex.add(z1, z2);
        System.out.println("\nSum : " + sum);

        // Sub
        Complex difference = Complex.sub(z1, z2);
        System.out.println("\nDifference : " + difference);

        // Multiply
        Complex product = Complex.mul(z1, z2);
        System.out.println("\nProduct : " + product);

        // Magnitude (modulus)
        double magnitude1 = Complex.magnitude(z1);
        System.out.println("\nMagnitude of z1 : " + magnitude1);
        double magnitude2 = Complex.magnitude(z2);
        System.out.println("Magnitude of z2 : " + magnitude2);

        // Conjugate
        Complex conjugate1 = Complex.conjugate(z1);
        System.out.println("\nConjugate of z1 : " + conjugate1);
        Complex conjugate2 = Complex.conjugate(z2);
        System.out.println("Conjugate of z2 : " + conjugate2);

        System.out.println();

    }
    
}
