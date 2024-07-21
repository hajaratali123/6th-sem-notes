import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExample {
    public static void main(String[] args) {
        // Creating a synchronized list
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Creating and starting multiple threads to modify the synchronized list concurrently
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedList.add(Thread.currentThread().getName() + "-" + i);
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

        // Printing the size of the synchronized list
        System.out.println("Size of synchronized list: " + synchronizedList.size());
    }
}
