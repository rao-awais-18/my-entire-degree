public class MethodReturn {

    int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        MethodReturn obj = new MethodReturn();
        System.out.println(obj.square(5));
    }
}