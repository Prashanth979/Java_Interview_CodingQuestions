//Java 8 program to fetch the first unique character from a string using Streams and LinkedHashMap (to preserve insertion order):

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        // Step 1: Build character frequency map using LinkedHashMap to preserve order
        Map<Character,Long> charCount = input.chars()
                                        .mapToObj(c -> (char)c)
                                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        // Step 2: Find the first character with count 1
        Optional<Character> firstUnique = charCount.entrySet()
                                                .stream()
                                                .filter(entry -> entry.getValue() == 1)
                                                .map(Map.Entry::getKey)
                                                .findFirst();
        
        //Output
        if(firstUnique.isPresent()){
            System.out.println("First Unique Character: "+firstUnique.get());
        }else{
            System.out.println("No Unique character found");
        }
                                                
    }
}
