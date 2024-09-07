package myInterface;

public class RectangleAbs extends Geometry {
    protected double l, w;

    public RectangleAbs() {
        l = 0.0;
        w = 0.0;
    }

    public RectangleAbs(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        return (l * w);
    }

    public double circumference() {
        return (2 * (l+w));
    }

    public double getWidth() {
        return w;
    }

    public double getLength() {
        return l;
    }
    
}
