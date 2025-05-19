package turing.edu.az.strategy.javacore.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Kartla ödəniş: " + amount + " AZN");
    }
}

