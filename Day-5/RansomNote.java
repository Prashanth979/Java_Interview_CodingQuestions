//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine, and false otherwise.
//Each letter in magazine can only be used once in ransomNote.
// Input: ransomNote = "a", magazine = "b"
// Output: false

// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        boolean isRansomNote = canConstruct(ransomNote,magazine);
        if(isRansomNote){
            System.out.println("Ransomnote can be constructed by using the letters from magazine");
        }else{
            System.out.println("Ransomnote can't be constructed by using the letters from magazine");
        }
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26]; // To count frequency of each letter in magazine
    
        for (char ch : magazine.toCharArray()) {
            letters[ch - 'a']++;
        }
    
        for (char ch : ransomNote.toCharArray()) {
            if (letters[ch - 'a'] == 0) {
                return false; // not enough of that character
            }
            letters[ch - 'a']--;
        }
    
        return true;
    }
}

// •	We use a HashMap<Character, Integer> to store how many times each character appears in magazine.
// •	Then for each character in ransomNote, we:
// •	Check if the character exists in the map and if the count is greater than 0.
// •	If not, return false.
// •	Otherwise, decrement the count for that character.

// public static boolean canConstruct(String ransomNote, String magazine) {
//     HashMap<Character, Integer> map = new HashMap<>();

//     // Count frequency of each character in magazine
//     for (char ch : magazine.toCharArray()) {
//         map.put(ch, map.getOrDefault(ch, 0) + 1);
//     }

//     // Check if ransomNote characters can be fulfilled
//     for (char ch : ransomNote.toCharArray()) {
//         if (!map.containsKey(ch) || map.get(ch) == 0) {
//             return false;
//         }
//         map.put(ch, map.get(ch) - 1);
//     }

//     return true;
// }
