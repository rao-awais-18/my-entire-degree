import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];

        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            arr[i] = new Student(id, name);
        }

        for (Student s : arr) {
            System.out.println(s.id + " " + s.name);
        }

        sc.close();
    }
}