public class BankAccount {

    private final int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name) {
        this.accountNumber = accountNumber;
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
        this.balance += money;
    }

    public void cashout(Double money) {
            this.balance -= money + 5.0;
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
