//ISOMORPHIC : Two strings s and t are isomorphic if the characters in s can be replaced to get t.

import java.util.HashMap;
import java.util.Map;

public class IsomorphicCheck {
    public static void main(String[] args) {
        String s="paper";
        String t="title";

    }

    boolean isIsomorphic(String s, String t){
        
        if(s.length()!=t.length())
            return false;
        //Creating HashMap to store the character mappings
        Map<Character,Character> charMapping = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMapping.containsKey(original)){
                if(!charMapping.containsValue(replacement)){
                    charMapping.put(original, replacement);             
                }else{
                    return false;
                }
            }else{
                char mappedCharacter = charMapping.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }
        return true;
    }



}
//Naive Solution
// public static boolean isIsomorphic(String s, String t) {
//     if (s.length() != t.length())
//         return false;

//     for (int i = 0; i < s.length(); i++) {
//         for (int j = i + 1; j < s.length(); j++) {
//             if (s.charAt(i) == s.charAt(j)) {
//                 // Corresponding characters in t should also match
//                 if (t.charAt(i) != t.charAt(j))
//                     return false;
//             } else {
//                 // If characters in s differ, corresponding t chars should also differ
//                 if (t.charAt(i) == t.charAt(j))
//                     return false;
//             }
//         }
//     }
//     return true;
// }