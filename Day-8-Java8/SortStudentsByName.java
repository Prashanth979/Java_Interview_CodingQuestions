//Java 8 program to sort a list of Student objects by their name using Stream.sorted() and Comparator.comparing():

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class SortStudentsByName {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Charlie"),
                new Student(102, "Alice"),
                new Student(103, "Bob")
        );

        // Sort by name
        List<Student> sortedList = students.stream()
                .sorted(Comparator.comparing(Student::getName))
                //.sorted(Comparator.comparing(Student::getName).reversed())  //---- To sort the names in the Descending order
                .collect(Collectors.toList());

        // Output
        System.out.println("Students sorted by name:");
        sortedList.forEach(System.out::println);
    }
}
