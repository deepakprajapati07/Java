// Use of throws clause in exception handling

import java.lang.*;

public class Demo5 {
    
    public static void main(String args[]) throws Exception {
        int array[] = new int[3];

        try {
            for (int i=0; i<4; i++) {
                array[i] = i;
            }
            System.out.println(array);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("filIn: " + e.fillInStackTrace());
            System.out.println("Cause: " + e.getCause());
            System.out.println("Local: " + e.getLocalizedMessage());
            System.out.println("Message: " + e.getMessage());
            System.out.println("Trace: " + e.getStackTrace());

            System.out.println();
            System.out.println();

            System.out.println("Trace: ");
            e.printStackTrace();
            System.out.println();

            System.out.println("string: ");
            e.toString();
            System.out.println();
            System.out.println();

            System.out.println("Oops, we went too far, better go back to 0!");
            throw (Exception) new Exception().initCause(e);
        }
        finally {
            System.out.println(array);
        }
    }
}
