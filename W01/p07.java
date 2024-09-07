// Write Java program to calculate the perimeter and the area of the circle. The radius of the circle is taken as user input. Use to different functions to calculate the perimeter and area. Define the value of PI as class constant.

import java.util.*;

public class p07 {

    // pi
    public static double PI = 3.14;

    // Functions
    public static double perimeter(double radius) {
        return (2 * PI * radius);
    }

    public static double area(double radius) {
        return (PI * radius * radius);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius of the circle : ");
        radius = sc.nextDouble();

        System.out.println("Perimeter of Circle : " + String.format("%.2f", perimeter(radius)));
        System.out.println("Area of circle : " + String.format("%.2f", area(radius)));

        sc.close();

    }
    
}
