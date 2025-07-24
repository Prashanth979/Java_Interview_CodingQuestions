//Java program to copy a list of student records (from one ArrayList to another).


// Step 1: Create a Student class

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString() for displaying student info
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class CopyStudentRecords {
    
    public static void main(String[] args) {
        // Step 2: Original list of students
        List<Student> originalList = new ArrayList<>();
        originalList.add(new Student(1, "Alice"));
        originalList.add(new Student(2, "Bob"));
        originalList.add(new Student(3, "Charlie"));

        // Step 3: Copy to a new list (shallow copy)
        List<Student> copiedList = new ArrayList<>(originalList);

        // Step 4: Print both lists
        System.out.println("Original List:");
        for (Student s : originalList) {
            System.out.println(s);
        }

        System.out.println("\nCopied List:");
        for (Student s : copiedList) {
            System.out.println(s);
        }
    }
}

// 🔁 Explanation:
// 	•	The copied list is a shallow copy — it copies references to the same Student objects.
// 	•	If you modify a student in one list, it will reflect in the other unless you create deep copies.
