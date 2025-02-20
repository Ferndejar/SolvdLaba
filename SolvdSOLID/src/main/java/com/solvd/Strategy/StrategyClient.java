package com.solvd.Strategy;

public class StrategyClient {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Using Credit Card Payment Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("4874567817345673", "Some Guy", "703", "12/26");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.payAmount(250.00);

        // Switching to PayPal Payment Strategy at runtime
        PaymentStrategy paypalPayment = new PaypalPayment("some.guy@gmail.com", "!SecurePassword123");
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.payAmount(150.00);
    }
}
