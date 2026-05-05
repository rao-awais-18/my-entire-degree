final class Test {
    final int x = 10;

    void show() {
        System.out.println(x);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}