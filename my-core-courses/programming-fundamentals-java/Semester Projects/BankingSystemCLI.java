import java.util.HashMap;
import java.util.Scanner;

class Account {
    int id;
    double balance;

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}

public class BankingSystemCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Account> accounts = new HashMap<>();

         System.out.println();
        System.out.println("==========  WELCME TO THE TECH SYTEM OF THE BANK OF AWAIS LIMITITED PAKISTAN  ==========");
        System.out.println();

        while (true) {
            System.out.println("CHOOSE WHAT WOULD YOU WANT TO DO WITH THIS SYSTEM \n1.Create \n2.Deposit \n3.Withdraw \n4.Check \n5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    accounts.put(id, new Account(id, 0));
                    break;

                case 2:
                    System.out.print("ID: ");
                    int did = sc.nextInt();
                    System.out.print("Amount To Deposit: ");
                    double damount = sc.nextDouble();

                    if (accounts.containsKey(did)) {
                        accounts.get(did).balance += damount;   // balance= balance + damount
                    }else{
                        System.out.println("SORRY! uable to desposit amount! \nThis id does't exist in the system");
                    }
                    break;

                case 3:
                    System.out.print("ID: ");
                    int wid = sc.nextInt();
                    System.out.print("Amount To Withdraw: ");
                    double wamount = sc.nextDouble();

                    if (accounts.containsKey(wid) && accounts.get(wid).balance >= wamount) {
                        accounts.get(wid).balance -= wamount;
                        System.out.println("An Amount of " +wamount + " has been Successfully Withdrwan from your account! \nTHANKS FOR USING AWIAS TECHS");
                    } else{
                        System.out.println("WE ARE VERY SORRY TO SAY BUT THERE IS SOME TROUBLE\nEither the id you entered is incorrect or your account blance is insufficient to withdraw!");
                    }
                    break;

                case 4:
                    System.out.print("ID: ");
                    int cid = sc.nextInt();

                    if (accounts.containsKey(cid)) {
                        System.out.println("Your Current Balance: " + accounts.get(cid).balance);
                    } else{
                        System.out.println("SORRY THIS USER DOES'T EXIST IN OUR SYSTEM");
                    }
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid");
            }
        }
    }
}