
// MyRunnable class implements the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExamThread {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new MyRunnable()); // create a thread with the runnable
        thread2.start(); // start the thread
    }
}