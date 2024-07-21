import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionExample {
    public static void main(String[] args) {
        // Creating a concurrent list
        CopyOnWriteArrayList<String> concurrentList = new CopyOnWriteArrayList<>();

        // Creating and starting multiple threads to modify the concurrent list concurrently
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                concurrentList.add(Thread.currentThread().getName() + "-" + i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        // Waiting for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the size of the concurrent list
        System.out.println("Size of concurrent list: " + concurrentList.size());
    }
}
