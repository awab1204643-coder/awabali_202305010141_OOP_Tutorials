package week_6;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("L100", "Dr Ahmad", "Java Programming", "Faculty of Information Technology");

        lecturer1.displayInfo();
        lecturer1.displaySubject();
        lecturer1.displayDepartment();
    }
}
