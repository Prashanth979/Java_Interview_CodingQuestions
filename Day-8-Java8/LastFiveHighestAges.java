//Java 8 program to print the last 5 highest ages of students, showing only the student names, and ensuring no duplicate ages are considered:

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (age=" + age + ")";
    }
}

public class LastFiveHighestAges {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 25),
            new Student("Bob", 30),
            new Student("Charlie", 28),
            new Student("David", 32),
            new Student("Eve", 30),
            new Student("Frank", 26),
            new Student("Grace", 28),
            new Student("Heidi", 35),
            new Student("Ivan", 31),
            new Student("Jack", 29),
            new Student("Kim", 27)
        );

        // Step 1: Get top 5 highest unique ages
        List<Integer> top5Ages = students.stream()
                .map(Student::getAge)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());

        // Step 2: Get student names who match these ages
        List<String> resultNames = students.stream()
                .filter(s -> top5Ages.contains(s.getAge()))
                .map(Student::getName)
                .collect(Collectors.toList());

        // Output
        System.out.println("Student names with top 5 highest unique ages:");
        resultNames.forEach(System.out::println);
    }
}
