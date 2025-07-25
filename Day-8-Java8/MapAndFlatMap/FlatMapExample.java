import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> namesNested = Arrays.asList(
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Charlie", "David"),
            Arrays.asList("Eve", "Frank")
        );

        // Using flatMap - result is Stream<String>
        List<String> flatList = namesNested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Using flatMap(): " + flatList);
    }
}
