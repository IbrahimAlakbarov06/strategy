package turing.edu.az.strategy.javacore.unnecessary;

public class PaymentService {
    public void pay(String method, double amount) {
        if (method.equals("card")) {
            // kartla ödəniş
        } else if (method.equals("paypal")) {
            // paypal ödəniş
        } else if (method.equals("cash")) {
            // nəğd ödəniş
        } else {
            throw new RuntimeException("Naməlum ödəniş metodu");
        }
    }
}
