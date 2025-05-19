package turing.edu.az.strategy.spring.controller;

import org.springframework.web.bind.annotation.*;
import turing.edu.az.strategy.spring.service.DiscountService;

@RestController
@RequestMapping("/api/discount")
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping
    public double getDiscount(@RequestParam String userType,@RequestParam double price) {
        return discountService.applyDiscount(userType, price);
    }
}

