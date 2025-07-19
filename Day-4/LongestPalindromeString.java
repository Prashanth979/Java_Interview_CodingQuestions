public class LongestPalindromeString {
    public static void main(String[] args) {
        String input = "abrbadaadab";
        String result = findLongestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }

    // Function to find the longest palindromic substring
    public static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0; // Start index of longest palindrome
        int end = 0; // End index of longest palindrome

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindrome (centered at i)
            int len1 = expandAroundCenter(s, i, i);

            // Check for even-length palindrome (centered between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);

            // Choose the longer length
            int len = Math.max(len1, len2);

            // If new palindrome is longer, update start and end
            if (len > end - start) {
                start = i - (len - 1) / 2; // new start index
                end = i + len / 2; // new end index
            }
        }

        // Extract the longest palindrome substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center and return palindrome length
    private static int expandAroundCenter(String s, int left, int right) {
        // Expand as long as characters at left and right are the same
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // move left pointer to the left
            right++; // move right pointer to the right
        }
        // Return length of the current palindrome
        return right - left - 1;
    }

}
