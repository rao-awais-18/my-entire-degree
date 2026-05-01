public class UtilityFunctionsLibrary {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(square(5));
    }
}