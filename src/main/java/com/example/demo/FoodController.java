package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @GetMapping("/recommend/food")
    public String recommendFood() {
        // This is a placeholder for the food recommendation logic
        return "Here are some food recommendations for Yunnan!";
    }
} 