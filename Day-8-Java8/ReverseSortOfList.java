//Java 8 program to sort a list in reverse order using Streams:

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSortOfList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 8);

        List<Integer> sortedDescendingIntegers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Reverse sorted list of Integers: " + sortedDescendingIntegers);
        
        List<String> fruits = Arrays.asList("banana", "apple", "mango", "orange");

        List<String> sortedDescendingStrings = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Reverse sorted list of Strings : " + sortedDescendingStrings);


    }


}
