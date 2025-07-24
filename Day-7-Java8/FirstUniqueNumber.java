import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,1,2,0,4,5,2);
        
        // Step 1: Count occurrences using LinkedHashMap to maintain order
        Map<Integer, Long> numberCount = numbers.stream()
                                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
                            
        // Step 2: Find the first number with count == 1
        Optional<Integer> firstUnique = numberCount.entrySet()
                                        .stream()
                                        .filter(entry -> entry.getValue() == 1)
                                        .map(Map.Entry::getKey)
                                        .findFirst();
        //Output
        if(firstUnique.isPresent()){
            System.out.println("First Unique Number : "+firstUnique.get());
        }else{
            System.out.println("No unique number found");
        }
    }
}
