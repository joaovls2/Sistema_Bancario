package com.joaovictor.bank.model;

public class BankAccount {

    private static int nextNumber = 100000;
    private final int accountNumber;
    private String name;
    private double balance;
    private AccountStatus status;

    public BankAccount(String name, double initialDeposit) {
        this.accountNumber = ++nextNumber;
        this.name = name;
        this.balance = initialDeposit;
        this.status = AccountStatus.ACTIVE;
    }

    public BankAccount(String name) {
        this.accountNumber = ++nextNumber;
        this.name = name;
        this.balance = 0.0;
        this.status = AccountStatus.ACTIVE;
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

    public boolean deposit(double money) {
        if(money <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        }
        if(status == AccountStatus.CLOSED){
            System.out.println("This account is closed.");
            return false;
        }
        this.balance += money;
        System.out.println("Deposit successful!");
        return true;
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
        if(status == AccountStatus.CLOSED){
            System.out.println("This account is closed.");
            return false;
        }
        balance -= money + 5.0;
        System.out.println("Withdraw successful!");
        return true;
    }

    public void closeAccount(){
        this.status = AccountStatus.CLOSED;
    }

    public void activateAccount(){
        this.status = AccountStatus.ACTIVE;
    }

    @Override
    public String toString() {
        return "Account data:\n"
                + "Account: "
                + accountNumber
                + ", Holder: "
                + name
                + ", balance: $ "
                + String.format("%.2f", getBalance())
                + ", Status: "
                + status;
    }
}
