package student_mangment_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Student s1 = new Student("Ali", "S001", "BIT1123");
            Course c1 = new Course("Object Oriented Programming", "BIT1123");
            Lecturer l1 = new Lecturer("Dr. Ahmad");

            s1.displayInfo();
            c1.displayCourse();
            l1.showRole();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student ID: ");
            String id = sc.nextLine();
            System.out.print("Enter course: ");
            String course = sc.nextLine();

            Student s2 = new Student(name, id, course);
            s2.displayInfo();
        }
    }
}
