// Find the length of the longest substring without repeating characters.
// Input: s = "abcabcbb"      Output: 3
// Explanation:
// The longest substring without repeating characters is "abc", which has length 3.

import java.util.HashSet;

//Program using Sliding Window Approach 
public class LongestSubstringSlidingWindow {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest Substring Length: " + result);
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            // If character already in set, remove leftmost and move window
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character and update max length
            set.add(currentChar);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}

// 🧠 Explanation:
// 	•	Use two pointers (left and right) to represent the current window.
// 	•	A HashSet tracks unique characters in the window.
// 	•	If a duplicate is found, move the left pointer until the window becomes valid again.
// 	•	Update the maxLen whenever you expand the window.
