//Given a string, determine if it contains any duplicate characters.
// Input: "hello"  
// Output: true   // 'l' is repeated

// Input: "abc"  
// Output: false  // No duplicates

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateChars {
    public static void main(String[] args) {
        String input = "hello";
        
        if (hasDuplicateChars(input)) {
            System.out.println("The string contains duplicate characters.");
        } else {
            System.out.println("The string does not contain duplicate characters.");
        }
    }

        public static boolean hasDuplicateChars(String str) {
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return true; // Duplicate found
            }
            seen.add(ch);
        }

        return false; // No duplicates
    }
}
