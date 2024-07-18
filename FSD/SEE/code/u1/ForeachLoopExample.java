import java.util.ArrayList;
import java.util.List;

public class ForeachLoopExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // foreach loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
