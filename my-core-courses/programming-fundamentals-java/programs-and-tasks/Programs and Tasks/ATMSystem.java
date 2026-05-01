import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance && amount % 500 == 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Failed");
        }

        sc.close();
    }
}