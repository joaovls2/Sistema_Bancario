import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = -1;
        double money;
        int number;
        BankAccount foundAccount;

        List<BankAccount> accounts = new ArrayList<>();

        while (option != 0) {
            exibirMenu();
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
                    System.out.println("Account number:");
                    number = sc.nextInt();

                    BankAccount account = findAccount(accounts, number);
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        System.out.println("Enter deposit value:");
                        money = sc.nextDouble();
                        account.deposit(money);
                        System.out.println("Deposit successful!");
                    }
                    break;
                case 3:
                    System.out.println("Account number:");
                    number = sc.nextInt();

                    foundAccount = findAccount(accounts, number);
                    if (foundAccount == null) {
                        System.out.println("No account found.");
                        break;
                    }

                    System.out.println("Enter withdraw value:");
                    money = sc.nextDouble();

                    if (money <= 0) {
                        System.out.println("Invalid value.");
                        break;
                    }
                    if (foundAccount.cashout(money)) {
                        System.out.println("Withdraw successful!");
                    } else {
                        System.out.println("Insufficient balance.");
                    }

                    System.out.println(foundAccount);
                    break;
                case 4:
                    System.out.println("Account number:");
                    number = sc.nextInt();

                    foundAccount = findAccount(accounts, number);
                    if (foundAccount == null) {
                        System.out.println("No account found.");
                        break;
                    }

                    sc.nextLine();
                    System.out.println("Are you sure you want to delete this account? (y/n)");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("y")) {
                        accounts.remove(foundAccount);
                        System.out.println("Account successfully deleted.");
                    } else {
                        System.out.println("Operation canceled.");
                    }
                    break;
                case 5:
                    System.out.println("Account number:");
                    number = sc.nextInt();

                    foundAccount = findAccount(accounts, number);
                    if (foundAccount == null) {
                        System.out.println("No account found.");
                    } else {
                        System.out.println(foundAccount); // chama toString()
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("========================================");
        System.out.println("        SISTEMA BANCÁRIO SIMPLES");
        System.out.println("========================================");
        System.out.println("1 - Criar nova conta");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saque (taxa R$ 5,00)");
        System.out.println("4 - Remover conta");
        System.out.println("5 - Consultar dados da conta");
        System.out.println("0 - Encerrar sistema");
        System.out.println("========================================");
        System.out.print("Digite a opção desejada: ");
    }

    public static BankAccount findAccount(List<BankAccount> list, int number) {
        for (BankAccount acc : list) {
            if (acc.getAccountNumber() == number) {
                return acc;
            }
        }
        return null;
    }
}