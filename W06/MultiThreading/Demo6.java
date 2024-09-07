// Setting Priority to  Threads

class Thread1 extends Thread {
    public void run() {
        System.out.println("\nStart Thread 1...");
        for (int i=1; i<=5; i++) {
            System.out.println("From Thread 1: i = " + i);
        }
        System.out.println("Exit Thread 1...\n");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("\nStart Thread 2...");
        for (int j=1; j<=5; j++) {
            System.out.println("From Thread 2: j = " + j);
        }
        System.out.println("Exit Thread 2...\n");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("\nStart Thread 3...");
        for (int k=1; k<=5; k++) {
            System.out.println("From Thread 3: k = " + k);
        }
        System.out.println("Exit Thread 3...\n");
    }
}

public class Demo6 {

    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t2.getPriority() + 1);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("\n...End of Execution...\n");
    }
    
}
