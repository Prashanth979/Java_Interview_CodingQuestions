//Given a string text, return the maximum number of instances that can be formed of the word “balloon”.
//You can use each character at most once.
// Input: "nlaebolko"            → Output: 1  
// Input: "loonbalxballpoon"     → Output: 2  
// Input: "leetcode"             → Output: 0

import java.util.HashMap;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));        // Output: 1
        // System.out.println(maxNumberOfBalloons("loonbalxballpoon")); // Output: 2
        // System.out.println(maxNumberOfBalloons("leetcode")); 
    }

        public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequencies of characters in text
        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // For "balloon", we need: b=1, a=1, l=2, o=2, n=1
        int b = freq.getOrDefault('b', 0);
        int a = freq.getOrDefault('a', 0);
        int l = freq.getOrDefault('l', 0) / 2;
        int o = freq.getOrDefault('o', 0) / 2;
        int n = freq.getOrDefault('n', 0);

        // Return the minimum of all needed counts
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}


// •	The word “balloon” requires:   'b': 1   'a': 1  'l': 2  'o': 2  'n': 1
// •	So we count the letters in the input string.
// •	For letters l and o, divide their count by 2.
// •	Finally, take the minimum of all those counts.