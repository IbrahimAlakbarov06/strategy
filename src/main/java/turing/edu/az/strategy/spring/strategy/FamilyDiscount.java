package turing.edu.az.strategy.spring.strategy;

import org.springframework.stereotype.Component;

@Component("family")
public class FamilyDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}

