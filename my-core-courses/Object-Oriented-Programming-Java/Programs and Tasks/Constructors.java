class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s = new Student("Ali", 95);
        s.display();
    }
}