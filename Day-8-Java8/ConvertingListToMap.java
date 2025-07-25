//Java 8 program to convert a List<Student> to a HashMap, where the key is the student ID (Integer) and the value is the Student object.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

public class ConvertingListToMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Alice"),
                new Student(102, "Bob"),
                new Student(103, "Charlie")
        );

        // Convert List<Student> to Map<Integer, Student>
        Map<Integer, Student> studentMap = students.stream()
                .collect(Collectors.toMap(
                        Student::getId,
                        student -> student
                ));

        // Output the map
        studentMap.forEach((id, student) ->
                System.out.println("ID: " + id + ", Student: " + student));
    }
}
