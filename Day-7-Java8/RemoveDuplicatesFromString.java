import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String input = "Programming";
        //Removing duplicates using LinkedHashSet to maintain Insertion Order
        String result = input.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.toCollection(LinkedHashSet::new))
                        .stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining());

        System.out.println("Original String : "+input);
        System.out.println("After removing duplicates : "+result);
    }
}

// 🧠 Explanation:
// 	•	input.chars(): Converts string to IntStream of characters.
// 	•	.mapToObj(c -> (char) c): Converts int to Character.
// 	•	LinkedHashSet: Maintains insertion order and removes duplicates.
// 	•	.map(String::valueOf).collect(Collectors.joining()): Joins characters into a string.