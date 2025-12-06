import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account number:");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder name:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        String resp = sc.nextLine();
        double money;

        BankAccount account1 = new BankAccount(accountNumber, name);

        if (resp.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value:");
            money = sc.nextDouble();
            account1.deposit(money);
        }

        System.out.println();
        System.out.println(account1);
        System.out.println();

        System.out.println("Enter a deposit value:");
        money = sc.nextDouble();
        account1.deposit(money);
        System.out.println("Updated account data:");
        System.out.println(account1);
        System.out.println();

        System.out.println("Enter a withdraw value:");
        money = sc.nextDouble();
        account1.cashout(money);
        System.out.println("Updated account data:");
        System.out.println(account1);
        sc.close();
    }
}