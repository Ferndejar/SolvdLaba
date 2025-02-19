package com.solvd.Proxy;

public class ProxyClient {
    public static void main(String[] args) {
        BankAccount myAccount = new ProxyBankAccount("Joseph", 7000.00);

        // Authorized access
        System.out.println("Trying with correct user:");
        myAccount.showBalance("Joseph");

        // Unauthorized access
        System.out.println("\nTrying with unauthorized user:");
        myAccount.showBalance("Alice");
    }
}
