public class HouseRobberDP {
    public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Maximum money (Optimized DP): " + rob(houses));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev1 = 0; // max money if we skip current
        int prev2 = 0; // max money if we take current

        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + num);
            prev2 = temp;
        }

        return prev1;
    }
}
