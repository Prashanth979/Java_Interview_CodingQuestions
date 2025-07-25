import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverageOfList {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    
            // Calculate sum
            int sum = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
    
            // Calculate average
            OptionalDouble average = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .average();
    
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "Not available"));
        }
}

// 🧠 Explanation:
// 	•	mapToInt(...) converts the Stream<Integer> to an IntStream.
// 	•	sum() calculates total.
// 	•	average() returns an OptionalDouble to safely handle empty lists.