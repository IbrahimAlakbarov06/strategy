package turing.edu.az.strategy.spring.service;

import org.springframework.stereotype.Service;
import turing.edu.az.strategy.spring.strategy.DiscountStrategy;

import java.util.Map;

@Service
public class DiscountService {

    private final Map<String, DiscountStrategy> strategies;

    public DiscountService(Map<String, DiscountStrategy> strategies) {
        this.strategies = strategies;
    }

    public double applyDiscount(String userType, double price) {
        DiscountStrategy strategy = strategies.get(userType);

        if (strategy == null) {
            System.out.println("Uygun strategiya tapılmadı: " + userType);
            return price;
        }

        return strategy.applyDiscount(price);
    }

}

