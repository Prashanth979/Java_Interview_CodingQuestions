import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestSalaryEmployees {
        public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 15000),
                new Employee("Bob", 10000),
                new Employee("Charlie", 20000),
                new Employee("David", 12000),
                new Employee("Eve", 20000),
                new Employee("Frank", 15000)
        );

        // Step 1: Get distinct salaries in descending order
        List<Double> sortedSalaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if (sortedSalaries.size() >= 2) {
            double secondHighest = sortedSalaries.get(1);

            // Step 2: Get employees with second highest salary
            List<Employee> result = employees.stream()
                    .filter(e -> e.getSalary() == secondHighest)
                    .collect(Collectors.toList());

            System.out.println("Employee(s) with second highest salary (" + secondHighest + "):");
            result.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
        } else {
            System.out.println("Not enough distinct salaries to find second highest.");
        }
    }
}
