import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}

public class StudentRecordSystem {

    static Student[] students = new Student[100];
    static int count = 0;



    public static void addStudent(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students[count++] = new Student(id, name, marks);
        System.out.println("Student Added");
    }

    public static void viewStudents() {
        if (count == 0) {
            System.out.println("No Records");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public static void searchStudent(Scanner sc) {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to Students Manager");
        System.out.println();

        while (true) {

            System.out.println("chosse an option from the below menue!");
            System.out.println("\n1.Add \n2.View \n3.Search \n4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}