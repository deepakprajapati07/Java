// Write java program to multiply two numbers, numbers should be taken from standard input

import java.util.*;

public class p04 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        int result = num1 * num2;

        System.out.println("Product of " + num1 + " & " + num2 + " is " + result);

        sc.close();

    }
    
}
