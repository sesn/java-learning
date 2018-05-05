class NewThread implements Runnable {
    Thread t;
    
    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: "+t);
    }

    public void run() {
        try {
            for(int i=5; i>0; i--) {
                System.out.println("CHild Thread: "+i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child thread Interrupted");
        }
        System.out.println("Exiting child thread.");
    }
}