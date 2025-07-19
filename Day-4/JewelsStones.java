//You’re given two strings:
//	•	jewels – a string representing the types of stones that are jewels.
//	•	stones – a string representing the stones you have.
//Each character in both strings represents a type of stone. You need to determine how many stones you have are also jewels.
//Ex:jewels = "aA"   stones = "aAAbbbb"    O/P: 3
//you have 3 jewels – 'a', 'A', and 'A' in the stones string.

public class JewelsStones {
    public static void main(String[] args) {
        //String jewels = "aA",stones="aAAbbbb";
        String jewels = "zz",stones="ZZZZ";
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char jewelChar=jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                char stonesChar = stones.charAt(j);
                if(jewelChar==stonesChar){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


//Program using HashMap and its T.C is O(N)
// public int numJewelsInStones(String jewels, String stones) {
//     int ans=0;
//     HashMap<Character,Integer> hm=new HashMap<>();
   
//     for(int i=0;i<stones.length();i++){
//         char sto=stones.charAt(i);
//         hm.put(sto,hm.getOrDefault(sto,0)+1);
//     }
//     for(int i=0;i<jewels.length();i++){
//         char jew=jewels.charAt(i);
//         if(hm.containsKey(jew)){
//             ans=ans+hm.get(jew);
//         }
//     }
// return ans;
// }


