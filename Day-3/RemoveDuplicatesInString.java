

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String input = "programming";

        // StringBuilder to store result without duplicates
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If result does not already contain the character, add it
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        // Print the final result
        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result.toString());
    }
}
