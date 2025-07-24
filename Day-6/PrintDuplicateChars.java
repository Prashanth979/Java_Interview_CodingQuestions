import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChars {
    public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        boolean hasDuplicates = false;

        // Print characters with frequency > 1
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}
