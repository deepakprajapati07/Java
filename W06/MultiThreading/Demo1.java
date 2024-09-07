// Multi Threading in Java using Thread class

class ThreadA extends Thread {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("From Thread A with i = " + (-i));
        }
        System.out.println("Exiting from Thread A...\n");
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int j=1; j<=5; j++) {
            System.out.println("From Thread B with j = " + (2*j));
        }
        System.out.println("Exiting from Thread B...\n");
    }
}

class ThreadC extends Thread {
    public void run() {
        for (int k=1; k<=5; k++) {
            System.out.println("From Thread C with k = " + (2*k-1));
        }
        System.out.println("Exiting from Thread C...\n");
    }
}

public class Demo1 {
    public static void main(String args[]) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();

        a.start();
        b.start();
        c.start();

        System.out.println("\n...Multi Threading is over...\n");
    }
}