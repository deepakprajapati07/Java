// Write Java program to read the three integers a, b and c from the keyboard and then print the largest value read

import java.util.*;

public class p05 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();

        // Determining the largest among a, b & c
        if (a > b) {
            if (a > c) {
                System.out.println("The largest value is " + a);
            } else {
                System.out.println("The largest value is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The largest value is " + b);
            } else {
                System.out.println("The largest value is " + c);
            }
        }

        sc.close();
    }
}