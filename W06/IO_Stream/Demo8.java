// Interactive Input-Output

import java.util.*;
import java.io.*;

public class Demo8 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // main 
    public static void main(String args[]) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("invent.dat"));

        // Reading from console
        System.out.print("Enter code number : ");
        st = new StringTokenizer(br.readLine());
        int code = Integer.parseInt(st.nextToken());

        System.out.print("Enter number of items : ");
        st = new StringTokenizer(br.readLine());
        int items = Integer.parseInt(st.nextToken());

        double cost;
        while (true) {
            System.out.print("Enter cost : ");
            try {
                cost = Double.parseDouble(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for cost. Please enter a valid number.");
            }
        }

        // Writing to the file
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);
        dos.close();

        // Processing data from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("invent.txt"));

        int codeNumber = dis.readInt();
        int totalItems = dis.readInt();
        double itemCost = dis.readDouble();
        double totalCost = totalItems * itemCost;
        dis.close();

        // Writing to console
        System.out.println();
        System.out.println("Code Number : " + codeNumber);
        System.out.println("Item Cost : " + itemCost);
        System.out.println("Total Items : " + totalItems);
        System.out.println("Total Cost : " + totalCost);
    }
}

