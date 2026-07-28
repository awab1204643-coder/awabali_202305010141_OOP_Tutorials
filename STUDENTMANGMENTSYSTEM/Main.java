import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while(true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Enroll in Course");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch(InputMismatchException e) {
                sc.nextLine();
                System.out.println("Please enter a valid number.");
                continue;
            }
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine().trim();
                    System.out.print("Enter program: ");
                    String program = sc.nextLine().trim();
                    if(name.isBlank() || id.isBlank() || program.isBlank()) {
                        System.out.println("Name, ID, and program cannot be empty.");
                    } else if (sms.addStudent(new Student(name, id, program))) {
                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2:
                    sms.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = sc.nextLine().trim();
                    Student found = sms.searchStudentById(searchId);
                    if(found != null) {
                        found.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    String sid = sc.nextLine().trim();
                    Student st = sms.searchStudentById(sid);
                    if(st != null) {
                        System.out.print("Enter course code: ");
                        String code = sc.nextLine().trim();
                        System.out.print("Enter course name: ");
                        String cname = sc.nextLine().trim();
                        if(code.isBlank() || cname.isBlank()) {
                            System.out.println("Course code and name cannot be empty.");
                        } else {
                            st.enrollCourse(new Course(code, cname));
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine().trim();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine().trim();
                    System.out.print("Enter new program: ");
                    String newProgram = sc.nextLine().trim();
                    sms.updateStudent(uid, newName, newProgram);
                    break;

                case 6:
                    System.out.print("Enter ID to delete: ");
                    String did = sc.nextLine().trim();
                    sms.deleteStudent(did);
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
