//Given a positive integer num, return true if num is a perfect square, otherwise return false.
//You must not use any built-in library function such as sqrt().

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16)); 
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 1) return false;

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true; // Found perfect square
            } else if (square < num) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return false; // Not a perfect square
    }
}
