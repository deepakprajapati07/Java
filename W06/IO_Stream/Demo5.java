// Reading and Writing Characters
// Character Stream Class

import java.io.*;

public class Demo5 {

    // main
    public static void main(String args[]) {
        // Declare and create input and output files
        File inFile = new File(args[0]);
        File outFile = new File("output.txt");

        // Create file stream ins and outs
        FileReader ins = null;
        FileWriter outs = null;

        try {
            // Open inFile and outFile
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);

            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
            System.out.println("File copying successful.");
        }
        catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
        finally {
            try {
                ins.close();
                outs.close();
            }
            catch (IOException e) {

            }
        }
    }
    
}
