// Read at most 10 names of students and store them into an array of String nameOfStudents[10]. Sort the names into the lexicographic order. Display the sorted list of names.

import java.util.*;

public class p01 {

    public static void main(String args[]) {
        int totalStudent = 10;
        String nameOfStudents[] = new String[totalStudent];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<totalStudent; i++) {
            System.out.print("Name of Student " + (i+1) + " : ");
            nameOfStudents[i] = sc.nextLine();
        }
        sc.close();

        // Sorting the names into lexicographic order
        Arrays.sort(nameOfStudents);

        // Displaying the names
        System.out.println("\nStudent's Record : ");
        for (int i=0; i<totalStudent; i++) {
            System.out.println((i+1) + ". " + nameOfStudents[i]);
        }
        System.out.println();
    }
    
}
