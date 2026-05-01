import java.util.Scanner;

public class FactorialCalculator {

    public static long factorialLoop(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long factorialRecursion(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Loop: " + factorialLoop(n));
        System.out.println("Recursion: " + factorialRecursion(n));

        sc.close();
    }
}