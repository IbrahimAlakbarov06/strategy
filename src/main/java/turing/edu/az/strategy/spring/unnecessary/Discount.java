package turing.edu.az.strategy.spring.unnecessary;

public class Discount {

    public double applyDiscount(String userType, double price) {
        if (userType.equals("student")) {
            return price * 0.9;
        } else if (userType.equals("family")) {
            return price * 0.85;
        } else {
            return price;
        }
    }
}

