package turing.edu.az.strategy.javacore.strategy;

public class PaypalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paypal ilə ödəniş: " + amount + " AZN");
    }
}

