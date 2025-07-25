import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "SpringBoot", "API", "Stream", "JDK");

        List<String> sortedByLength = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Sorted list (by length): " + sortedByLength);
    }
}

// 🧠 Explanation:
// 	•	Comparator.comparingInt(String::length) compares strings based on their length.
// 	•	.sorted(...) sorts them in ascending order of length.
