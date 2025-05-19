package turing.edu.az.strategy.javacore.context;

import turing.edu.az.strategy.javacore.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.pay(amount);
    }
}

