package studentmgt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studenttest {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        // Create a list to store students
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add a student");
            System.out.println("2. Display students");
            System.out.println("3. Exit");

            int option = u.nextInt();

            switch (option) {
                case 1:
                    // Add a student
                    Student newStudent = StudentUtility.addStudent();
                    students.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Display students
                    StudentUtility.displayStudent(students);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter a valid number");
            }
        }
    }
}
