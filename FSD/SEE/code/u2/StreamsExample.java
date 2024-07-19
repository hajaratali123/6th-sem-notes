import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        // Creating a list of names using Arrays.asList
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using streams to process elements
        System.out.println("Using streams to process elements:");
        names.stream()
                .filter(name -> name.startsWith("A")) // Intermediate operation (filtering)
                .forEach(System.out::println); // Terminal operation (printing)

        // Attempting to modify the stream (not possible, streams are immutable)
        names.stream().map(String::toUpperCase).forEach(System.out::println); // Uncommenting this line will cause an exception

        // Adding a new element (not possible directly with streams)
        names.add("David"); // Uncommenting this line will cause an UnsupportedOperationException
    }
}
