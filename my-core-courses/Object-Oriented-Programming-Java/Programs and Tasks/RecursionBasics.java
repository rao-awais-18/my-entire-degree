public class RecursionBasics {

    int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        RecursionBasics obj = new RecursionBasics();
        System.out.println(obj.factorial(5));
    }
}