package myInterface;

public class CircleAbs extends Geometry {
    public double r;

    public CircleAbs() {
        r = 1.0;
    }

    public CircleAbs(double r) {
        this.r = r;
    }

    public double area() {
        return (PI * r * r);
    }

    public double circumference() {
        return (2 * PI * r);
    }

    public double getRadius() {
        return r;
    }
    
}
