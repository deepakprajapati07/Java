// Write java program to calculate the Square of a number

import java.util.Scanner;

public class p02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sqr = num * num;

        System.out.println("Square of " + num + " is " + sqr);

        sc.close();

    }
}
