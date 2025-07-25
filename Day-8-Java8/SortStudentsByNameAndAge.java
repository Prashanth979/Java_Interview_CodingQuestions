//Java 8 program to sort a list of students based on Name and then Age, using Comparator.comparing() and thenComparing():

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

public class SortStudentsByNameAndAge {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Alice", 22),
                new Student(102, "Bob", 21),
                new Student(103, "Alice", 20),
                new Student(104, "David", 23),
                new Student(105, "Bob", 19)
        );

        // Sort by name, then age
        List<Student> sortedList = students.stream()
                .sorted(Comparator.comparing(Student::getName)
                        .thenComparing(Student::getAge))
                .collect(Collectors.toList());

        // Output
        System.out.println("Students sorted by name and age:");
        sortedList.forEach(System.out::println);
    }
}
