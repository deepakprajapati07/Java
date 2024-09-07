// Output Stream Test

import java.io.*;

public class Demo3 {
    
    // main
    public static void main(String args[]) {
        // Declare and initialize a byte array byte
        byte cities[] = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'D', 'R', 'A', 'S', '\n', 'L', 'O', 'N', 'D', 'O', 'N', '\n'};

        // Create an output file stream
        FileOutputStream outfile = null;
        try {
            // Connect the outfile to "city.txt"
            outfile = new FileOutputStream("city.txt");
            // Write data to the stream
            outfile.write(cities);
            outfile.close();
            System.out.println("Data written to file successfully.");
        }
        catch (IOException ioe) {
            System.out.println(ioe);
            System.exit(-1);
        }
    }

}
