public class BankAccount {

    private static int nextNumber = 100000;
    private final int accountNumber;
    private String name;
    private double balance;

    public BankAccount(String name, double initialDeposit) {
        this.accountNumber = ++nextNumber;
        this.name = name;
        this.balance = initialDeposit;
    }

    public BankAccount(String name) {
        this.accountNumber = ++nextNumber;
        this.name = name;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        if(money <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        System.out.println("Deposit successful!");
        this.balance += money;
    }

    public boolean cashout(double money) {
        if (money + 5.0 > balance) {
            System.out.println("Not enough balance to perform this operation.");
            return false;
        }
        if (money <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return false;
        }
        System.out.println("Withdraw successful!");
        balance -= money + 5.0;
        return true;
    }

    @Override
    public String toString() {
        return "Account data:\n"
                + "Account: "
                + accountNumber
                + ", Holder: "
                + name
                + ", balance: $ "
                + String.format("%.2f", getBalance());
    }
}
