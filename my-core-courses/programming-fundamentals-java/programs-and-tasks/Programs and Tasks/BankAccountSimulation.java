class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    void showBalance() {
        System.out.println(balance);
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        acc.withdraw(200);
        acc.showBalance();
    }
}