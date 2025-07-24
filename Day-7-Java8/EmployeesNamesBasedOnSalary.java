import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeesNamesBasedOnSalary {
        public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", 12000),
                new Employee("Bob", 9500),
                new Employee("Charlie", 15000),
                new Employee("David", 8000),
                new Employee("Eve", 11000)
        );

        // Filter employees with salary > 10000 and print their names
        List<String> highPaidEmployees = employeeList.stream()
                .filter(emp -> emp.getSalary() > 10000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        // Output
        System.out.println("Employees with salary > 10000:");
        highPaidEmployees.forEach(System.out::println);
    }
}
