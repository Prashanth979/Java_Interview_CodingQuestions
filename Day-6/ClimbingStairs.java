// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 step or 2 steps.
// In how many distinct ways can you climb to the top?

// Input: n = 2  
// Output: 2  
// Explanation: There are two ways to climb to the top:
// 1. 1 step + 1 step  
// 2. 2 steps

public class ClimbingStairs {
    public static void main(String[] args) {
        
        int n=8;
        int ans=climbStairs(n);
        System.out.println("No of ways to climb "+n+" stairs is "+ans);
    }
    public static int climbStairs(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        
        int first=1;
        int second=2;
        
        for(int i=3;i<=n;i++){
            int result=first+second;
            first=second;
            second=result;
        }
        return second;
    }

        // Recursive brute-force method
        public static int climbStairsRecursive(int n) {
            if (n == 0) return 1; // Reached the top
            if (n < 0) return 0;  // Invalid path
            return climbStairs(n - 1) + climbStairs(n - 2); // Try 1-step and 2-step
        }
}
