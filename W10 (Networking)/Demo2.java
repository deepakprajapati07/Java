// URLConnection

import java.io.*;
import java.net.*;

public class Demo2 {

    public static void main(String args[]) {
        try {
            URL url = new URL("https://nptel.ac.in/course.php");

            URLConnection urlcon = url.openConnection();

            InputStream stream = urlcon.getInputStream();

            int b;

            while((b = stream.read()) != -1) {
                System.out.print((char)b);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
