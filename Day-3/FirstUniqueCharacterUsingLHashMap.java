//Java program(Using LinkedHashMap) to find and print the first unique (non-repeating) character from a given string:
//Ex: I/P: programming   O/P: p

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterUsingLHashMap {
    public static void main(String[] args) {
                String input = "programming"; // The input string to check

        // Call the method to find the first unique character
        Character firstUniqueChar = findFirstUniqueChar(input);

        // Print the result
        if (firstUniqueChar != null) {
            System.out.println("First unique character: " + firstUniqueChar);
        } else {
            System.out.println("No unique character found.");
        }
    }

    // Method to find the first unique (non-repeating) character
    public static Character findFirstUniqueChar(String str) {

        // LinkedHashMap stores characters in the order they appear,
        // and keeps a count of how many times each character appears
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Step 1: Count each character's occurrences in the string
        for (char ch : str.toCharArray()) {
            // If character is already there, increase its count
            // Otherwise, add it with count = 1
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Loop through the map to find the first character with count = 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // This is the first unique character
            }
        }

        // If no character has count = 1, return null
        return null;
    }
}
