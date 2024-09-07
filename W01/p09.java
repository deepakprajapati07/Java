// Write a program to find out the number of days in a month using switch-case. Month number and year is taken as input through keyboard

import java.util.*;

public class p09 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int month, year;
        System.out.print("Enter the month number (1 - 12) : ");
        month = sc.nextInt();
        System.out.print("Enter the year : ");
        year = sc.nextInt();

        sc.close();

        int daysInMonth;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;   // Leap Year
                } else {
                    daysInMonth = 28;   // Non-Leap Year
                }
                break;
        
            default:
                System.out.println("Invalid month number");
                return;
        }

        System.out.println("No. of days in month " + month + " in " + year + " is " + daysInMonth);

    }
    
}
