// 💡 Problem Statement:

// You are given a list of Student objects.
// Each student has a name and a list of courses they are enrolled in.

// Your task:
// 	1.	Use map() to print each student’s list of courses.
// 	2.	Use flatMap() to get a single List<String> of all course names (no duplicates).

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private List<String> courses;

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }
}

public class Example {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", Arrays.asList("Math", "Physics", "Chemistry")),
            new Student("Bob", Arrays.asList("Biology", "Math", "English")),
            new Student("Charlie", Arrays.asList("History", "Physics", "Math"))
            );
           
            students.stream()
                .map(Student::getCourses) // returns Stream<List<String>>
                .forEach(courseList -> System.out.println("Courses: " + courseList));

            List<String> uniqueCourses = students.stream()
                                                .flatMap(student -> student.getCourses().stream()) // Stream<String>
                                                .distinct()
                                                .collect(Collectors.toList());
                System.out.println("All unique courses: " + uniqueCourses);
    }
}
