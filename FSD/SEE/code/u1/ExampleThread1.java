// Thread1 class extends the Thread class
class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExampleThread1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start(); // start the thread
    }
}