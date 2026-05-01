import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

      
    void display() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.println();
        System.out.println("==========  WELCME TO THE STUDENTS MANAGEMENT SYSTEM BY RAO AWAIS  ==========");
        System.out.println();
        while (true) {
            System.out.println("CHOOSE WHAT WOULD YOU LIKE TO DO🤗\n1.Add \n2.View \n3.Delete \n4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(id, name, marks));
                    break;

                case 2:
                    for (Student s : list) {
                        System.out.println("ALL ENROLLED STUDENTS ARE");
                        s.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    list.removeIf(s -> s.id == delId);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! run again and a valid choice from the given options!");
            }
        }
    }
}