// try with multiple catch block

public class Demo2 {
    public static void main(String args[])     {
        try {
            int i = args.length;
            String myString[] = new String[i];

            if (args[0].equals("Java")) {
                System.out.println("First word is Java!");
            }
            System.out.println("Number of arguments = " + i);
            int x = 12/i;
            int y[] = {555, 999};
            y[i] = x;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0 " + e);
        }
        catch (NullPointerException e) {
            System.out.println("A null pointer exception : " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound : " + e);
        }
    }
}
