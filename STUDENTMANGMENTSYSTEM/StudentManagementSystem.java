import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        if(student == null) {
            System.out.println("Invalid student data.");
            return false;
        }
        if(searchStudentById(student.getId()) != null) {
            System.out.println("A student with ID " + student.getId() + " already exists.");
            return false;
        }
        students.add(student);
        return true;
    }

    public void displayStudents() {
        if(students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for(Student s : students) {
                s.displayInfo();
                System.out.println("-------------------");
            }
        }
    }

    public Student searchStudentById(String id) {
        if(id == null) {
            return null;
        }
        for(Student s : students) {
            if(s.getId().equalsIgnoreCase(id.trim())) {
                return s;
            }
        }
        return null;
    }

    public void updateStudent(String id, String newName, String newProgram) {
        Student s = searchStudentById(id);
        if(s != null) {
            if(newName != null && !newName.isBlank()) {
                s.setName(newName.trim());
            }
            if(newProgram != null && !newProgram.isBlank()) {
                s.setProgram(newProgram.trim());
            }
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String id) {
        Student s = searchStudentById(id);
        if(s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}
