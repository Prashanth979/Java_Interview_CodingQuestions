//Java 8 program to find the first duplicate element from a List of Strings:

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FirstDuplicateElementFromListOfStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "date");

        Set<String> seen = new HashSet<>();

        Optional<String> firstDuplicate = names.stream()
                .filter(name -> !seen.add(name)) // add returns false if already present
                .findFirst();

        if (firstDuplicate.isPresent()) {
            System.out.println("First duplicate element: " + firstDuplicate.get());
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}

// 🧠 Explanation:
// 	•	seen.add(name) adds the name to the set and returns false if it’s already there.
// 	•	filter(...) catches the first repeated entry.
// 	•	findFirst() returns the first match.