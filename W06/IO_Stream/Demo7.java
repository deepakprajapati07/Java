// Random Access File

import java.io.*;

public class Demo7 {

    // main
    public static void main(String args[]) {
        RandomAccessFile rFile;

        try {
            rFile = new RandomAccessFile("city.txt", "rw");

            rFile.seek(rFile.length());
            rFile.writeBytes("MUMBAI\n");
            rFile.close();
            System.out.println("Write Successful");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
