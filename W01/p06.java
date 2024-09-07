// Write a Java Program to read the name of a student (studentName), roll Number (rollNo) and marks (totalMarks) obtained. rollNo may be an alphanumeric string. Display the data as read

import java.util.*;

public class p06 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name, rollNo;
        int marks;

        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your roll no. : ");
        rollNo = sc.next();
        System.out.print("Enter your total marks : ");
        marks = sc.nextInt();

        System.out.println("----------------------------------");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Total Marks : " + marks);

        sc.close();
    }
    
}
