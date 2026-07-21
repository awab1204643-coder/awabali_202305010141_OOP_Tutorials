import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        // Add 3 tasks
        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = input.nextLine();
            tasks.add(task);
        }

        // Display tasks
        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save tasks to file
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("tasks.txt"));

            for (String task : tasks) {
                writer.println(task);
            }

            writer.close();
            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }

        // Read tasks from file
        ArrayList<String> loadedTasks = new ArrayList<>();

        try {
            File file = new File("tasks.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                loadedTasks.add(reader.nextLine());
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // Display tasks loaded from file
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        for (String task : loadedTasks) {
            System.out.println(task);
        }

        input.close();
    }
}
