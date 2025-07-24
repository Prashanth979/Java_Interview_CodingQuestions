
public class MaximumSubArrayDP {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = findMaxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] nums) {
        int n = nums.length;

        // dp[i] will store the max subarray sum ending at index i
        int[] dp = new int[n];
        dp[0] = nums[0];

        int max = dp[0];

        // Build the dp array
        for (int i = 1; i < n; i++) {
            // Either extend the previous subarray or start new from current element
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = Math.max(max, dp[i]); // update max if needed
        }

        return max;
    }
}
