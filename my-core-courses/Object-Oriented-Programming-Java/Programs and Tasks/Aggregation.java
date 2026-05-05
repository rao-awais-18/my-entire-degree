class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(name + " " + address.city);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address a = new Address("Karachi");
        Student s = new Student("Ali", a);
        s.display();
    }
}