package myInterface;

public class EllipseAbs extends Geometry {
    protected double a, b;

    public EllipseAbs() {
        a = 0.0;
        b  = 0.0;
    }

    public EllipseAbs(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return (PI * a * b);
    }

    public double circumference() {
        return (PI * (a + b));
    }

    public double getMinorAxis() {
        return a;
    }

    public double getMajorAxis() {
        return b;
    }
    
}
