public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create five threads with different priorities
        Thread thread1 = new Thread(new Task(), "Thread-1");
        Thread thread2 = new Thread(new Task(), "Thread-2");
        Thread thread3 = new Thread(new Task(), "Thread-3");
        Thread thread4 = new Thread(new Task(), "Thread-4");
        Thread thread5 = new Thread(new Task(), "Thread-5");
  
        // Set different priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.NORM_PRIORITY); // 5
        thread4.setPriority(Thread.MAX_PRIORITY); // 10
        thread5.setPriority(Thread.MAX_PRIORITY); // 10
  
        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
  
        // Put the highest priority threads to sleep
        try {
            Thread.sleep(1000); // Ensure all threads have started
            System.out.println(thread4.getName() + " is going to sleep.");
            thread4.sleep(2000);
            System.out.println(thread5.getName() + " is going to sleep.");
            thread5.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  
        // Check the aliveness of the threads
        System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
        System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());
        System.out.println(thread3.getName() + " is alive: " + thread3.isAlive());
        System.out.println(thread4.getName() + " is alive: " + thread4.isAlive());
        System.out.println(thread5.getName() + " is alive: " + thread5.isAlive());
  
        // Join the threads to ensure main thread waits for them to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  
        // Determine which thread lasted the longest
        System.out.println("All threads have finished execution.");
    }
  }
  
  class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } }}
  