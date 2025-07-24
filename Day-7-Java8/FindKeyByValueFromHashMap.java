import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindKeyByValueFromHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("101", "John");
        map.put("102", "Alice");
        map.put("103", "Bob");
        map.put("104", "Alice");

        String targetValue = "Alice";
        //Finding all keys that map to the target value
        List<String> keys = map.entrySet()
                            .stream()
                            .filter(entry -> entry.getValue().equals(targetValue))
                            .map(Map.Entry::getKey)
                            .collect(Collectors.toList());
        
        //Output
        if(!keys.isEmpty()){
            System.out.println("Keys for value \""+targetValue+"\":"+keys);
        }else{
            System.out.println("No Keys found for value \""+targetValue+"\".");
        }
    }
}
