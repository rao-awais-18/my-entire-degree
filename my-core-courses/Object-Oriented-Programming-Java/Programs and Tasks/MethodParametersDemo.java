public class MethodParametersDemo {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MethodParametersDemo obj = new MethodParametersDemo();
        obj.add(5, 3);
    }
}