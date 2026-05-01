class Student {
    String name;
    int marks;

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class StudentClassSystem {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ali";
        s.marks = 90;
        s.display();
    }
}