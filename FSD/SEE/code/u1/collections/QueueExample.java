package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // PriorityQueue
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");

        // ArrayDeque
        Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Apple");
        arrayDeque.add("Banana");
        arrayDeque.add("Cherry");

        // LinkedList as Queue
        Queue<String> linkedListQueue = new ArrayDeque<>(); // Avoid LinkedList, use ArrayDeque
        linkedListQueue.add("Apple");
        linkedListQueue.add("Banana");
        linkedListQueue.add("Cherry");

        System.out.println("PriorityQueue: " + priorityQueue); // Priority order
        System.out.println("ArrayDeque: " + arrayDeque); // FIFO order
        System.out.println("LinkedList Queue: " + linkedListQueue); // FIFO order
    }
}
