// Static variable in java

public class p01 {

    public static class Circle {
        static int circleCount = 0; // class variable
        public double x, y, r;      // instance variables

        public Circle(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
            circleCount++;
        }

        public double circumference() {
            return (2 * 3.14159 * r);
        }

        public double area() {
            return (3.14159 * r * r);
        }
    }

    public static void main(String args[]) {

        System.out.println("Circle Count 0 : " + Circle.circleCount);

        Circle c1 = new Circle(3.0, 2.0, 5.0);
        System.out.println("Circle Count 1 : " + c1.circleCount);
        Circle c2 = new Circle(5.0, 3.0, 4.0);
        System.out.println("Circle Count 2 : " + c2.circleCount);

    }
}