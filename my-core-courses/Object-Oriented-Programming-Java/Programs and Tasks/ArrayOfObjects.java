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

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        arr[0] = new Student("Ali", 80);
        arr[1] = new Student("Awais", 90);
        arr[2] = new Student("Ahmed", 85);

        for (Student s : arr) {
            s.display();
        }
    }
}