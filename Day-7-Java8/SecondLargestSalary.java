import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestSalary {
        public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 15000),
                new Employee("Bob", 10000),
                new Employee("Charlie", 20000),
                new Employee("David", 12000),
                new Employee("Eve", 20000) // Duplicate top salary
        );

        // Step 1: Get distinct salaries in descending order
        List<Double> sortedSalaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Step 2: Get second highest salary
        if (sortedSalaries.size() >= 2) {
            double secondHighest = sortedSalaries.get(1);
            System.out.println("Second highest salary: " + secondHighest);
        } else {
            System.out.println("Not enough distinct salaries to find second highest.");
        }
    }
}
