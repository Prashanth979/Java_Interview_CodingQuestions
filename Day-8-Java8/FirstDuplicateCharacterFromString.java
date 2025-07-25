import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FirstDuplicateCharacterFromString {
    public static void main(String[] args) {
        String input = "programming";

        Set<Character> seen = new HashSet<>();

        Optional<Character> firstDuplicate = input.chars()                    // IntStream of chars
                .mapToObj(c -> (char) c)                                     // Stream<Character>
                .filter(c -> !seen.add(c))                                   // add() returns false if already present
                .findFirst();                                                // get first duplicate

        if (firstDuplicate.isPresent()) {
            System.out.println("First duplicate character: " + firstDuplicate.get());
        } else {
            System.out.println("No duplicate character found.");
        }
    }
}
// 🧠 Explanation:
// 	•	seen.add(c) returns false if c is already in the set → used to detect duplicates.
// 	•	findFirst() gives the first duplicate.
// 	•	The program preserves the original order of the string.
