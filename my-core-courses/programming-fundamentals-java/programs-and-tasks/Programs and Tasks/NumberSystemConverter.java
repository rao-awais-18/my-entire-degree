import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Hex: " + Integer.toHexString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));

        sc.close();
    }
}
