package week_2;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("Ali", 20, 3.5);

        // Display student info
        s1.displayInfo();

        // Call other methods
        s1.study();
        s1.takeExam();
    }
}
