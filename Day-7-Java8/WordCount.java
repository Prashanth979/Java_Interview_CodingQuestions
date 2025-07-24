//Java 8 program that finds the count of each word in a given sentence using Stream, Collectors, and Map:

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "apple banana apple orange banana apple";
        
        // Split the sentence into words and use stream to count each word
        Map<String,Long> wordCount = Arrays.stream(sentence.split("\\s+"))
                                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            //Print the result
        wordCount.forEach((word, count) ->
        System.out.println(word+" : "+count));

    }
}

// 🧠 Explanation:
// 	•	sentence.split("\\s+"): Splits the sentence by whitespace.
// 	•	Arrays.stream(...): Creates a stream of words.
// 	•	Collectors.groupingBy(...): Groups words by identity (the word itself).
// 	•	Collectors.counting(): Counts how many times each word appears.
