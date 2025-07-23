public class RemoveSpecialCharAndNumbers {
    public static void main(String[] args) {
        String input = "He@ll#o! 123 Wo^rld$%&";
        
        // Keep only alphabetic characters
        String result = input.replaceAll("[^a-zA-Z]", "");
        System.out.println(result);
    }
}
