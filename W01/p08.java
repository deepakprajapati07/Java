// Write a program to check the number is even or odd. Input is taken from keyboard.

import java.util.*;

public class p08 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
    
}
