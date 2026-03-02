import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = -1;
        double money;
        BankAccount foundAccount;

        List<BankAccount> accounts = new ArrayList<>();

        while (option != 0) {
            displayMenu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter account holder name:");
                    String name = sc.nextLine();

                    System.out.println("Is there an initial deposit (y/n)?");
                    String resp = sc.nextLine();

                    BankAccount acc;
                    if (resp.equalsIgnoreCase("y")) {
                        System.out.println("Enter initial deposit value:");
                        double value = sc.nextDouble();
                        acc = new BankAccount(name, value);
                    } else {
                        acc = new BankAccount(name);
                    }

                    accounts.add(acc);
                    System.out.println("Account created successfully!");
                    System.out.println(acc);
                    break;
                case 2:
                    foundAccount = validateAccount(sc, accounts);
                    if (foundAccount != null) {
                        System.out.println("Enter deposit value:");
                        money = sc.nextDouble();
                        foundAccount.deposit(money);
                    }
                    break;
                case 3:
                    foundAccount = validateAccount(sc, accounts);

                    if (foundAccount != null) {
                        System.out.println("Enter withdraw value:");
                        money = sc.nextDouble();
                        foundAccount.cashout(money);
                    }
                    break;
                case 4:
                    foundAccount = validateAccount(sc, accounts);
                    sc.nextLine();
                    if(foundAccount != null) {
                        System.out.println("Are you sure you want to delete this account? (y/n)");
                        String confirm = sc.nextLine();
                        if (confirm.equalsIgnoreCase("y")) {
                            accounts.remove(foundAccount);
                            System.out.println("Account successfully deleted.");
                        }
                    }
                    break;
                case 5:
                    foundAccount = validateAccount(sc, accounts);
                   if (foundAccount != null){
                        System.out.println(foundAccount); // chama toString
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Option invalid!");
            }
        }
        sc.close();
    }

    public static void displayMenu() {
        System.out.println("========================================");
        System.out.println("           SYSTEM BANK MENU           ");
        System.out.println("========================================");
        System.out.println("1 - Create account");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdrawal (Rate $5,00)");
        System.out.println("4 - Delete account");
        System.out.println("5 - Account data");
        System.out.println("0 - Exit");
        System.out.println("========================================");
        System.out.print("Enter the desired option: ");
    }

    public static BankAccount validateAccount(Scanner sc, List<BankAccount> list) {
        System.out.println("Enter account number:");
        int number = sc.nextInt();

        for (BankAccount acc : list) {
            if (acc.getAccountNumber() == number) {
                return acc;
            }
        }
        System.out.println("No account found.");
        return null;
    }
}