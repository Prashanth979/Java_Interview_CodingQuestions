// Given:
// An array of integers nums and an integer target.
// Task:
// Return the indices of the two numbers such that they add up to the target.

import java.util.HashMap;

public class TwoSumArrays {
    public static void main(String[] args) {
        int arr[]={9,7,2,11};
        int target = 9;
        //int result[]=twoSumBruteForce(arr,target);
        int result[]=twoSumHashMap(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
    public static int[] twoSumBruteForce(int arr[],int target){
        for(int i=0;i<arr.length-1;i++){    
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                    return new int[]{i,j};
            }
        }
    return new int[]{};
    }

    //Problem Solving Using HashMap
    public static int[] twoSumHashMap(int nums[],int target){
                // Map to store value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current value and index in map
            map.put(nums[i], i);
        }

        // If no solution found (though problem says there is always one)
        return new int[] {};
    }
    // 🧠 How it works:
	// •	The HashMap keeps track of each number’s index.
	// •	For each number, we check if (target - current number) exists in the map.
	// •	If it does, we return both indices.
}
