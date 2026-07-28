import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String program;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollCourse(Course course) {
        if(course == null) {
            return;
        }
        for(Course existing : courses) {
            if(existing.getCourseCode().equalsIgnoreCase(course.getCourseCode())) {
                System.out.println("Student is already enrolled in course " + course.getCourseCode() + ".");
                return;
            }
        }
        courses.add(course);
        System.out.println("Course enrolled successfully!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Program: " + program);
        if(courses.isEmpty()) {
            System.out.println("Enrolled courses: None");
        } else {
            System.out.println("Enrolled courses:");
            for(Course course : courses) {
                System.out.println(" - " + course.getCourseCode() + ": " + course.getCourseName());
            }
        }
    }
}
