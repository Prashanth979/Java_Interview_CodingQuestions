
// Given an integer array nums and an integer k,
// return the k most frequent elements.
// Input: nums = [1,1,1,2,2,3], k = 2  
// Output: [1,2]
// Explanation: The frequencies are:
//  1 → 3 times
//  2 → 2 times
//  3 → 1 time
// Top 2 frequent elements = 1 and 2
// 🔍 Idea:
// 	1.	Count frequencies using a HashMap.
// 	2.	Sort the entries by frequency (descending).
// 	3.	Pick the top k entries.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElementsHashMap {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topKFrequent(nums, k)));
    }

        public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert map entries to a list and sort by frequency
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue()); // Descending order

        // Step 3: Collect top K frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}


