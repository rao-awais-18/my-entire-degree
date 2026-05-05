public class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(5, 3));
        System.out.println(obj.add(2.5, 3.5));
    }
}