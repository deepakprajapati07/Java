// InetAddress

import java.net.*;

public class Demo4 {
    public static void main(String args[]) {
        try {
            // InetAddress ip = InetAddress.getByName("www.nptel.ac.in");
            // InetAddress ip = InetAddress.getByName("www.tezu.ac.in");
            InetAddress ip = InetAddress.getByName("www.tezu.ernet.in");

            System.out.println("Host Name : " + ip.getHostName());
            System.out.println("IP Address : " + ip.getHostAddress());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
