// Random Access File in Java

import java.io.*;

public class Demo6 {
    
    // main
    public static void main(String args[]) {
        RandomAccessFile file = null;

        try {
            file = new RandomAccessFile("sample.dat", "rw");
            // Writing to file
            file.writeChar('X');
            file.writeInt(555);
            file.writeDouble(3.1412);

            // Go to the beginning
            file.seek(0);

            // Reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());

            // Go to the second item
            file.seek(2);

            System.out.println(file.readInt());

            // Go to the end and append false to the file
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}