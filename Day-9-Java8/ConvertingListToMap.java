// Java 8 program to convert a List<Student> into a Map<Integer, Student>, where:
// 	•	Key = studentId
// 	•	Value = Corresponding Student object

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // toString
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class ConvertingListToMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Anjali"),
            new Student(2, "Ravi"),
            new Student(3, "Kiran"),
            new Student(4, "Arjun")
        );

        // Convert List to Map<studentId, Student>
        Map<Integer, Student> studentMap = students.stream()
                .collect(Collectors.toMap(
                    Student::getId,
                    student -> student
                ));

        // Print the map
        studentMap.forEach((id, student) ->
                System.out.println("Key: " + id + ", Value: " + student));
    }
}


//Collectors.toMap() is used to transform a list to a map.