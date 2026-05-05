class Student {
    String name;
    int marks;

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class Class_and_objects {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ali";
        s.marks = 85;
        s.display();
    }
}