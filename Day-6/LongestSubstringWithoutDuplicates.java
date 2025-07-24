// Find the length of the longest substring without repeating characters.
// Input: s = "abcabcbb"      Output: 3
// Explanation:
// The longest substring without repeating characters is "abc", which has length 3.

//Program using Brute-Force Algorithm
public class LongestSubstringWithoutDuplicates {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest Substring Length: " + result);
    }
        // Helper method to check if substring has all unique characters
        public static boolean allUnique(String s, int start, int end) {
            boolean[] charSet = new boolean[128]; // ASCII set
    
            for (int i = start; i <= end; i++) {
                char ch = s.charAt(i);
                if (charSet[ch]) {
                    return false; // duplicate found
                }
                charSet[ch] = true;
            }
            return true;
        }
    
        public static int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int n = s.length();
    
            // Check all substrings from index i to j
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (allUnique(s, i, j)) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
    
            return maxLength;
        }

}
