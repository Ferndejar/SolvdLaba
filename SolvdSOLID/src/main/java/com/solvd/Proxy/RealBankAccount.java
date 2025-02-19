package com.solvd.Proxy;

public class RealBankAccount implements BankAccount{

    private double balance;

    public RealBankAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public void showBalance(String user) {
        System.out.println("Hello " + user + ", your account balance is: $" + balance);
    }
}
