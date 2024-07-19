import java.util.ArrayList;
import java.util.List;

public class CollectionsExampleforDiffinstrdcol{
    public static void main(String[] args) {
        // Creating a list of names using ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Direct access and modification
        System.out.println("Accessing element directly: " + names.get(1)); // Bob

        // Iterating through the collection
        System.out.println("Iterating through the collection:");
        for (String name : names) {
            System.out.println(name);
        }

        // Adding a new element
        names.add("David");
        System.out.println("After adding a new element:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
