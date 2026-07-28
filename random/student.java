import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<String> courses;

    public Student(String name, String id, String email) {
        super(name, id, email);
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
        } else {
            System.out.println("Already enrolled in this course.");
        }
    }

    public void dropCourse(String course) {
        courses.remove(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Enrolled Courses: " + (courses.isEmpty() ? "None" : courses));
    }
}