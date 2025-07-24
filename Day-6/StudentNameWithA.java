
// Student class

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // For printing student info
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class StudentNameWithA {
        public static void main(String[] args) {
        // List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Anil"));
        students.add(new Student(4, "Charlie"));
        students.add(new Student(5, "Arun"));
        students.add(new Student(6, "David"));

        // Filter and print names starting with 'A' or 'a'
        System.out.println("Students whose names start with 'A':");
        for (Student s : students) {
            if (s.name.toLowerCase().startsWith("a")) {
                System.out.println(s);
            }
        }
    }
}
