import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "peach", "banana", "apple");

        // Intermediate Operations

        // 1. filter: Keeps only words longer than 5 characters.
        List<String> filteredWords = words.stream()
                                          .filter(word -> word.length() > 5)
                                          .collect(Collectors.toList());
        System.out.println("Filtered words (length > 5): " + filteredWords);

        // 2. map: Converts each word to uppercase.
        List<String> uppercaseWords = words.stream()
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());
        System.out.println("Uppercase words: " + uppercaseWords);

        // 3. distinct: Removes duplicate words.
        List<String> distinctWords = words.stream()
                                         .distinct()
                                         .collect(Collectors.toList());
        System.out.println("Distinct words: " + distinctWords);

        // 4. sorted: Sorts the words alphabetically.
        List<String> sortedWords = words.stream()
                                       .sorted()
                                       .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords);

        // 5. limit: Takes only the first two words.
        List<String> limitedWords = words.stream()
                                        .limit(2)
                                        .collect(Collectors.toList());
        System.out.println("Limited words (first two): " + limitedWords);

        // Terminal Operations

        // 6. collect: Collects the processed words into a list.
        List<String> collectedWords = words.stream()
                                          .filter(word -> word.length() > 5)
                                          .map(String::toUpperCase)
                                          .distinct()
                                          .sorted()
                                          .limit(2)
                                          .collect(Collectors.toList());
        System.out.println("Collected words: " + collectedWords);

        // 7. forEach: Prints each word in the filtered list.
        words.stream()
             .filter(word -> word.length() > 5)
             .forEach(System.out::println);

        // 8. findFirst: Finds the first word starting with "b" and prints it if present.
        String firstBWord = words.stream()
                                 .filter(word -> word.startsWith("b"))
                                 .findFirst()
                                 .orElse("No word found starting with 'b'");
        System.out.println("First word starting with 'b': " + firstBWord);

        // 9. mapToInt and sum: Calculates the total length of all words.
        int totalLength = words.stream()
                               .mapToInt(String::length)
                               .sum();
        System.out.println("Total length of all words: " + totalLength);
    }
}
