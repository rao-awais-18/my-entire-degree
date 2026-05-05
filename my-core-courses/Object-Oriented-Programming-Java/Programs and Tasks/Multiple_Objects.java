class Student {
    String name;
    int marks;

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class Multiple_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ali";
        s1.marks = 80;

        s2.name = "Awais";
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}