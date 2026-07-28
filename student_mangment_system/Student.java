package student_mangment_system;

public class Student extends Person {
    private String course;

    public Student(String name, String id, String course) {
        super(name, id);
        this.course = course;
    }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + ", ID: " + getId() + ", Course: " + course);
    }
}
