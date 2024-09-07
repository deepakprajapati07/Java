// Use of yield(), stop() and sleep() methods
// stop(), suspend() and resume() methods are depriciated 

class ClassA extends Thread {
    public void run() {
        System.out.println("\nStart Thread A...");
        for (int i=1; i<=5; i++) {
            if (i == 2) {
                Thread.yield();
            }
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("...Exit Thread A\n");
    }
}

class ClassB extends Thread {
    private volatile boolean running = true;

    public void run() {
        System.out.println("\nStart Thread B...");
        int j = 1;
        while (running) {
            System.out.println("From Thread B: j = " + j);
            j++;

            if (j == 3) {
                stopThread();
            }
        }
        System.out.println("Exit Thread B...\n");
    }

    public void stopThread() {
        running = false;
    }
}

class ClassC extends Thread {
    public void run() {
        System.out.println("\nStart Thread C...");
        for (int k=1; k<=5; k++) {
            System.out.println("From Thread C: k = " + k);
            if (k == 3) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception Caught...\n");
                }
            }
        }
    }
}

public class Demo5 {
    public static void main(String args[]) {
        ClassA t1 = new ClassA();
        ClassB t2 = new ClassB();
        ClassC t3 = new ClassC();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("\n...End of Execution...\n");
    }
    
}
