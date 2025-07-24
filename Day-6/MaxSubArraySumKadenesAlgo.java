

public class MaxSubArraySumKadenesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
        int maxSum1 = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum - Navie Solution is: " + maxSum1);

    }
    public static int findMaxSubarraySum(int[] nums) {
        int maxSoFar = nums[0];  // maximum sum so far
        int currentSum = nums[0];  // current subarray sum

        for (int i = 1; i < nums.length; i++) {
            // If current sum is negative, start new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        return maxSoFar;
    }
    // 💡 Explanation:
	// •	currentSum keeps track of the current subarray sum.
	// •	If currentSum drops below the current number, it resets to the current number.
	// •	maxSoFar stores the maximum subarray sum found so far.

    //Naive Solution
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
               
                sum+=nums[i];

                if(sum>maxSum){
                    maxSum = sum;
                }
                if(sum<0){
                    sum=0;
                }
        }
    return maxSum;
    }
}
