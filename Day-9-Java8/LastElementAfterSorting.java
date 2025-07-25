import java.util.Arrays;
import java.util.Optional;

public class LastElementAfterSorting {
    public static void main(String[] args) {
        Integer[] numbers = {5, 1, 8, 3, 2};

        @SuppressWarnings("unused")
        Optional<Integer> lastElement = Arrays.stream(numbers)
                .sorted()
                .reduce((first, second) -> second); // get the last element

        if (lastElement.isPresent()) {
            System.out.println("Last element after sorting: " + lastElement.get());
        } else {
            System.out.println("Array is empty.");
        }
    }
}

// 🧠 Explanation:
// 	•	Arrays.stream(numbers) turns the array into a stream.
// 	•	.sorted() sorts in ascending order.
// 	•	.reduce((first, second) -> second) keeps returning the last element.

// For Descending Order
// Arrays.stream(numbers)
//       .sorted(Comparator.reverseOrder())
//       .reduce((first, second) -> second); // smallest element