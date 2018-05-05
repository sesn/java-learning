class NewThread extends Thread {
    
    NewThread() {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    // Entry point for the second thread
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child thread: "+ i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child thread Interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class ExtendThread {
    public static void main(String args[]) {
        NewThread nt = new NewThread();

        nt.start(); // start the thread

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main thread: "+ i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting main thread");
    }
}