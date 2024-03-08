package studentmgt;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {

    public static Student addStudent() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Please enter a student ID: ");
            int studentId = s.nextInt();
            System.out.println("Please enter a student name: ");
            String studentName = s.next();
            System.out.println("Please enter a student age: ");
            int studentAge = s.nextInt();

            return new Student(studentId, studentName, studentAge);
        }
    }


    public static void displayStudent(List<Student> students) {
        Iterator<Student> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
    }
}
