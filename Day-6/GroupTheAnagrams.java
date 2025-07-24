// Given an array of strings, group the anagrams together.
// Anagrams are words that contain the same characters in a different order.
// For example: "eat", "tea", "ate" are all anagrams.

// Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
// Output: [
//   ["eat","tea","ate"],
//   ["tan","nat"],
//   ["bat"]
// ]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupTheAnagrams {
        public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

        public static List<List<String>> groupAnagrams(String[] strs) {
        // Map with sorted string as key and list of anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array, sort it, and turn back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add the original word to the list of its anagram group
            anagramMap.computeIfAbsent(sorted, _ -> new ArrayList<>()).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }
}
