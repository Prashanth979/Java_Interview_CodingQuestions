import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GetStudentListByDepartments {
        public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "Computer Science"),
                new Student("Bob", "Electronics"),
                new Student("Charlie", "Computer Science"),
                new Student("David", "Mechanical"),
                new Student("Eve", "Electronics")
        );

        // Grouping students by department
        Map<String, List<Student>> studentsByDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        // Output
        studentsByDept.forEach((dept, stuList) -> {
            System.out.println("Department: " + dept);
            stuList.forEach(student -> System.out.println(" - " + student.getName()));
        });
    }
}
