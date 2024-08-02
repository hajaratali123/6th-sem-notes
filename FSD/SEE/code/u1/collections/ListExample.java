package collections;

import java.util.*;
public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        System.out.println("LinkedList: " + linkedList);
        // Iterating over a list
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
