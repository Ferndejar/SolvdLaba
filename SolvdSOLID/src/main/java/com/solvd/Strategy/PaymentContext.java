package com.solvd.Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
