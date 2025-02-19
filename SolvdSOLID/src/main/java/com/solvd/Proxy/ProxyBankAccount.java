package com.solvd.Proxy;

public class ProxyBankAccount implements BankAccount{

    private RealBankAccount realBankAccount;
    private String authorizedUser;

    public ProxyBankAccount(String authorizedUser, double initialBalance) {
        this.authorizedUser = authorizedUser;
        this.realBankAccount = new RealBankAccount(initialBalance);
    }
    @Override
    public void showBalance(String user) {
        if (user.equals(authorizedUser)) {
            realBankAccount.showBalance(user);
        } else {
            System.out.println("Access denied! " + user + " is not authorized to view this account.");
        }
    }
}
