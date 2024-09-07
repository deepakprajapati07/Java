import myInterface.*;

public class Demo8 {
    public static void main(String args[]) {

        // create an array to hold geometry objects
        Geometry geoObjects[] = new Geometry[3];

        geoObjects[0] = new CircleAbs(2.0);
        geoObjects[1] = new RectangleAbs(1.0, 3.0);
        geoObjects[2] = new EllipseAbs(2.0, 4.0);

        double totalArea = 0;

        for (int i=0; i<3; i++) {
            totalArea = totalArea + geoObjects[i].area();
        }

        System.out.println("Total area of the geo-objects is " + totalArea);
    }
    
}
