// Sort the People 
//	"Example 1:
// Input: names = [""Mary"",""John"",""Emma""], heights = [180,165,170]
// Output: [""Mary"",""Emma"",""John""]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:
// Input: names = [""Alice"",""Bob"",""Bob""], heights = [155,185,150]
// Output: [""Bob"",""Alice"",""Bob""]

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static void main(String[] args) {
        String names[]={"Mary","John","Emma"};
        int heights[]={180,165,170};
        String res[]=sortPeoplesHeight(names,heights);
        System.out.println(Arrays.toString(res));
    }

    public static String[] sortPeoplesHeight(String names[],int heights[]){
        String ans[]=new String[names.length];
        HashMap<Integer,String> hm = new HashMap<>();

        for(int i=0;i<names.length;i++){
            String key = names[i];
            int val=heights[i];
            hm.put(val,key);
        }

        Arrays.sort(heights);
        int index=0;
        for(int j=names.length-1;j>=0;j--){
           ans[index]=hm.get(heights[j]);
           index++;
        }
        return ans;
    }
}
