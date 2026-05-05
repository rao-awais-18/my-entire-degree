class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectArraySorting {
    public static void main(String[] args) {
        Student[] arr = {
            new Student("Ali", 80),
            new Student("Awais", 90),
            new Student("Ahmed", 85)
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].marks > arr[j + 1].marks) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (Student s : arr) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}