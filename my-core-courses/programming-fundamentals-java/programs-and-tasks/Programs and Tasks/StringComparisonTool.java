import java.util.Scanner;

public class StringComparisonTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println("Equals: " + a.equals(b));
        System.out.println("Ignore Case: " + a.equalsIgnoreCase(b));
        System.out.println("Compare: " + a.compareTo(b));

        sc.close();
    }
}