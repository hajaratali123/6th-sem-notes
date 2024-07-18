import java.util.*;

public class NonGenericExample {
    public static void main(String[] args) {
        List list = new ArrayList(); // Raw type, not type-safe
        list.add("Hello");
        list.add(123); // No compile-time error, but not safe

        for (Object obj : list) {
            String str = (String) obj; // Causes ClassCastException at runtime
            System.out.println(str);
        }
    }
}
 