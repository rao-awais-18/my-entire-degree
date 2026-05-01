import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoAppMids {

    static final String FILE_NAME = "tasks.txt";

    static void saveTasks(ArrayList<String> tasks) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
        for (String task : tasks) {
            bw.write(task);
            bw.newLine();
        }
        bw.close();
    }

    static ArrayList<String> loadTasks() throws IOException {
        ArrayList<String> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) return tasks;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            tasks.add(line);
        }

        br.close();
        return tasks;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = loadTasks();

         System.out.println();
        System.out.println("==========  WELCME TO MY FILE BASED TO DO APP  ==========");
        System.out.println();

        while (true) {
            System.out.println("CHOOSE AN OPTION FRROM BELOW MENUE\n1.Add \n2.View \n3.Delete \n4.Save & Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Task: ");
                    tasks.add(sc.nextLine());
                    break;

                case 2:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                    }
                    break;

                case 4:
                    saveTasks(tasks);
                    System.exit(0);

                default:
                    System.out.println("Invalid");
            }
        }
    }
}