package student_mangment_system;

public class Lecturer extends UniversityMember {
    private String name;

    public Lecturer(String name) {
        this.name = name;
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Lecturer.");
    }
}
