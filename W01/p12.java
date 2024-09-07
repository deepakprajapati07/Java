/*
 Write a program to calculate the grade of a student. There are five subjects. Marks in each subject are entered from keyboard. Assign grade based on the following rule: 
    Total Marks >= 90 Grade: Ex
    90 > Total Marks >= 80 Grade: A
    80 > Total Marks >= 70 Grade: B
    70 > Total Marks >= 60 Grade: C
    60 > Total Marks Grade: F

*/

import java.util.*;

public class p12 {

    public static void main(String args[]) {
        int sub = 5;
        float marks[] = new float[sub];
        Scanner sc = new Scanner(System.in);
        
        // Taking marks input
        for (int i=0; i<sub; i++) {
            System.out.print("Marks of Subject " + (i+1) + " : ");
            marks[i] = sc.nextFloat();
        }
        sc.close();

        // Calculating total marks
        float totalMarks = 0;
        for (int i=0; i<sub; i++) {
            totalMarks += marks[i];
        }
        float avg = totalMarks/sub;
        String grade;

        // Assigning Grades
        if (avg >= 90) {
            grade = "Ex";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Student's Score : " + String.format("%.2f", avg) + "%");
        System.out.println("Student's Grade : " + grade);

    }
    
}
