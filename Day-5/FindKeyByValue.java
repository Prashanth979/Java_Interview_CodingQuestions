import java.util.HashMap;
import java.util.Map;

public class FindKeyByValue {
    public static void main(String[] args) {
        // Step 1: Create a HashMap and add some values
        HashMap<String, String> map = new HashMap<>();
        map.put("101", "Prashanth");
        map.put("102", "Kiran");
        map.put("103", "Rahul");

        // Step 2: Set the value you want to search for
        String valueToFind = "Kiran";

        // Step 3: Create a variable to store the found key
        String foundKey = null;

        // Step 4: Go through each entry in the map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            // If the value matches what we're looking for
            if (entry.getValue().equals(valueToFind)) {
                foundKey = entry.getKey(); // store the key
                break; // stop the loop once found
            }
        }

        // Step 5: Print the result
        if (foundKey != null) {
            System.out.println("Key for value '" + valueToFind + "' is: " + foundKey);
        } else {
            System.out.println("Value not found in the map.");
        }
    }
}
