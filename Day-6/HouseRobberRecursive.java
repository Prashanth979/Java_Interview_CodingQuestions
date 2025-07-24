// You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, represented by an array of non-negative integers nums.
// You cannot rob two adjacent houses, because that will alert the police.
// 🧾 Task:
// Return the maximum amount of money you can rob without robbing two adjacent houses.
// Input: nums = [2, 7, 9, 3, 1]  
// Output: 12  
// Explanation: Rob house 1 (2) + house 3 (9) + house 5 (1) = 12

public class HouseRobberRecursive {
    public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Maximum money (Brute Force): " + rob(houses));
    }
    public static int rob(int[] nums) {
        return robFrom(nums, 0);
    }

    // Try robbing from each index recursively
    private static int robFrom(int[] nums, int index) {
        if (index >= nums.length) return 0;

        // Option 1: Rob this house, skip the next
        int rob = nums[index] + robFrom(nums, index + 2);

        // Option 2: Skip this house, try next
        int skip = robFrom(nums, index + 1);

        return Math.max(rob, skip);
    }

}
