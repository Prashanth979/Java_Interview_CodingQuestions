import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class StudentNameStartsWithA {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(101, "Anjali"),
            new Student(102, "Ravi"),
            new Student(103, "Aman"),
            new Student(104, "Kiran"),
            new Student(105, "Arjun")
        );

        List<Student> filteredStudents = students.stream()
                .filter(s -> s.name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students whose name starts with 'A':");
        filteredStudents.forEach(System.out::println);
    }
}
