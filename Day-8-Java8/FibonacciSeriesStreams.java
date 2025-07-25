import java.util.stream.Stream;

public class FibonacciSeriesStreams {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
              .limit(n)
              .map(fib -> fib[0])
              .forEach(System.out::println);
    }
}

// 🧠 Explanation:
// 	•	Stream.iterate(initial, nextFunction) is used to generate pairs [a, b], [b, a+b].
// 	•	limit(n) restricts to first n terms.
// 	•	map(fib -> fib[0]) extracts and prints the current Fibonacci number.