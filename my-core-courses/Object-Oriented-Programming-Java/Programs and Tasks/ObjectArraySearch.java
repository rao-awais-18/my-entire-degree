class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectArraySearch {
    public static void main(String[] args) {
        Student[] arr = {
            new Student("Ali", 80),
            new Student("Awais", 90),
            new Student("Ahmed", 85)
        };

        String search = "Awais";
        boolean found = false;

        for (Student s : arr) {
            if (s.name.equals(search)) {
                System.out.println("Found: " + s.name + " " + s.marks);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}