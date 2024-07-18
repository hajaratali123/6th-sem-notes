import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Type-safe, holds only Strings
        list.add("Hello");
        // list.add(123); // Compile-time error, prevents adding non-String

        for (String str : list) {
            System.out.println(str); // No need for casting, safe
        }
    }
}
