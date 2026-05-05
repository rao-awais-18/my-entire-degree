interface A {
    void showA();
}

interface B {
    void showB();
}

class Test implements A, B {
    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Test t = new Test();
        t.showA();
        t.showB();
    }
}