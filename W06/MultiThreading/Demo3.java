// Thread class methods : getID()

class ThreadId extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Demo3 {
    public static void main(String args[]) {
        int n = 10;  // Number of thread
        for (int i=0; i<n; i++) {
            ThreadId object = new ThreadId();
            object.start();
        }
    }
    
}
