import java.util.Scanner;

public class SwitchUseCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Day Name");
        System.out.println("2. Even/Odd");
        System.out.println("3. Simple Menu");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter day number: ");
                int day = sc.nextInt();
                switch (day) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    case 4: System.out.println("Thursday"); break;
                    case 5: System.out.println("Friday"); break;
                    case 6: System.out.println("Saturday"); break;
                    case 7: System.out.println("Sunday"); break;
                    default: System.out.println("Invalid");
                }
                break;

            case 2:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                switch (num % 2) {
                    case 0: System.out.println("Even"); break;
                    case 1: System.out.println("Odd"); break;
                }
                break;

            case 3:
                System.out.println("A. Tea B. Coffee");
                char ch = sc.next().charAt(0);
                switch (ch) {
                    case 'A': System.out.println("Tea selected"); break;
                    case 'B': System.out.println("Coffee selected"); break;
                    default: System.out.println("Invalid");
                }
                break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }
}