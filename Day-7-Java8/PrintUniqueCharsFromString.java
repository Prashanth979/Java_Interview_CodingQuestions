import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintUniqueCharsFromString {
    public static void main(String[] args) {
        String input = "Programming";
        //Step 1: Building Character frequency Map
        Map<Character, Long> frequencyMap = input.chars()
                                            .mapToObj(c -> (char)c)
                                            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        //Step 2: Print characters with count=1 (unique characters)
        System.out.print("Unique characters: ");
        frequencyMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .forEach(ch -> System.out.print(ch+" "));
                    
        System.out.println();
    }
}

// 🧠 Explanation:
// 	•	input.chars().mapToObj(...): Converts string into a stream of characters.
// 	•	groupingBy(..., counting()): Groups and counts each character.
// 	•	LinkedHashMap: Keeps the original order of characters.
// 	•	Filter and print characters with frequency == 1.
