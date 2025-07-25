import java.util.stream.IntStream;

public class PalindromeCheckStreams {
    public static void main(String[] args) {
        String input = "madam";

        boolean isPalindrome = IntStream.range(0, input.length() / 2)
                .allMatch(i -> input.charAt(i) == input.charAt(input.length() - i - 1));

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
// 🧠 How It Works:
// 	•	IntStream.range(0, input.length()/2) iterates halfway.
// 	•	Compares charAt(i) with charAt(length - i - 1).
// 	•	allMatch(...) returns true only if all character pairs match.
