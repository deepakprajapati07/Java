// Thread Id using Runnable Iterface

class ThreadID implements Runnable {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Demo4 {
    public static void main(String args[]) {
        int n = 10;     // Number of thread
        for (int i=0; i<n; i++) {
            Thread object = new Thread(new ThreadID());
            object.start();
        }
    }
    
}
