import java.util.Scanner;

public class InputOutputHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("YOUR ENTERED DATA IS:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        sc.close();
    }
}