import myInterface.*;

public class Demo7 {

    static void display(float x, float y) {
        System.out.println("Area = " + x + "\nPerimeter = " + y);
    }

    public static void main(String args[]) {
        Circle c = new Circle(5.2f);
        Ellipse e = new Ellipse(4.5f, 3.6f);
        Rectangle r = new Rectangle(6.5f, 4.3f);

        GeoAnalyser geoItem;

        geoItem = c;
        System.out.println("\nCircle");
        display(geoItem.area(), geoItem.perimeter());

        geoItem = e;
        System.out.println("\nEllipse");
        display(geoItem.area(), geoItem.perimeter());

        geoItem = r;
        System.out.println("\nRectangle");
        display(geoItem.area(), geoItem.perimeter());
    }
    
}
