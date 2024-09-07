// Write java program to calculate the Factorial of a 10 (iteratively and recursively)

public class p11 {

    public static int factIterative(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int factRecursive(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return (n * factIterative(n - 1));
    }

    public static void main(String args[]) {
        int n = 10;

        System.out.println("Iterative Factorial of " + n + " is " + factIterative(n));
        System.out.println("Recursive Factorial of " + n + " is " + factRecursive(n));

    }
    
}
