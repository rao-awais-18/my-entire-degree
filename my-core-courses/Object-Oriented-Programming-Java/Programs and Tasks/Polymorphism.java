class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}