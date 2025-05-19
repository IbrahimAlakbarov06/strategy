package turing.edu.az.strategy.javacore;

import turing.edu.az.strategy.javacore.context.PaymentContext;
import turing.edu.az.strategy.javacore.strategy.CreditCardPayment;
import turing.edu.az.strategy.javacore.strategy.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(100);

        context.setStrategy(new PaypalPayment());
        context.pay(200);
    }
}

