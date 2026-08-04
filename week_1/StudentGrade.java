package week_1;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();

        System.out.println("Student: " + name + " | Grade: " + grade);

        if (grade >= 50) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }

        scanner.close();
    }
}
