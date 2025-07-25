import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<List<String>> namesNested = Arrays.asList(
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Charlie", "David"),
            Arrays.asList("Eve", "Frank")
        );

        // Using map - result is Stream<Stream<String>>
        Stream<Stream<String>> mapped = namesNested.stream()
                .map(list -> list.stream());

        System.out.println("Using map():");
        mapped.forEach(inner -> {
            inner.forEach(System.out::println);
        });
    }
}
