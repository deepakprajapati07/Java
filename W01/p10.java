// Write java program to calculate the Sum of the square of first 10 integers

public class p10 {

    public static void main(String args[]) {
        int n = 10;
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += (i*i);
        }

        System.out.println("Sum : " + sum);
    }
    
}
