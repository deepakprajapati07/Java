// Input Stream Test

import java.io.*;

public class Demo2 {

    // main
    public static void main(String args[]) {
        FileInputStream fin = null;

        try {
            // Open a file input stream
            fin = new FileInputStream("test.txt");

            int size = fin.available();

            // Returns the number of bytes available
            System.out.println("Total bytes : " + size);
            System.out.println("First 1/4 portion is displayed : Using read() ");
            for (int i = 0; i < size / 4; i++) {
                System.out.print((char) fin.read());
            }

            System.out.println("\nRemaining bytes : " + fin.available());
            System.out.println("Next 1/4 portion is displayed : Using read(b[])");
            byte b[] = new byte[size / 4];
            if (fin.read(b) != b.length) {
                System.out.println("File reading error.");
            } else {
                // Convert the bytes into string
                String temp = new String(b, 0, b.length);
                // Display text string
                System.out.println(temp);
                System.out.println("Still available : " + fin.available());
                System.out.println("Skipping 1/4 : Using skip() ");
                fin.skip(size / 4);
                System.out.println("File remaining for read :: " + fin.available());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
