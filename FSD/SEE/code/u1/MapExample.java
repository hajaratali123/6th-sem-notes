import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Apple");
        hashMap.put("2", "Banana");

        // TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "Apple");
        treeMap.put("2", "Banana");

        // LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "Apple");
        linkedHashMap.put("2", "Banana");

        System.out.println("HashMap: " + hashMap); // No guaranteed order
        System.out.println("TreeMap: " + treeMap); // Sorted order by key
        System.out.println("LinkedHashMap: " + linkedHashMap); // Insertion order

        // Using getOrDefault
        System.out.println("Value for key 3: " + hashMap.getOrDefault("3", "Not Found")); // Not Found
    }
}
