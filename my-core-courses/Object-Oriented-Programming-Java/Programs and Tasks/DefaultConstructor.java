class Student {
    String name;
    int marks;

    Student() {
        name = "Unknown";
        marks = 0;
    }

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}