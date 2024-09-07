// Reading from a file

import java.io.*;

public class Demo4 {
    
    // main 
    public static void main(String args[]) {
        // Create an input file stream
        FileInputStream infile = null;
        int b;

        try {
            // Connect infile stream to the required file
            infile = new FileInputStream(args[0]);
            
            while((b = infile.read()) != -1) {
                // Read and display data
                System.out.print((char) b);
            }
            infile.close();
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
