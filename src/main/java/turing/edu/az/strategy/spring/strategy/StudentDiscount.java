package turing.edu.az.strategy.spring.strategy;

import org.springframework.stereotype.Component;

@Component("student")
public class StudentDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}

