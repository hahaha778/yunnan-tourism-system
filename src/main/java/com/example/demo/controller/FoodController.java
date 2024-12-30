package com.example.demo.controller;

import com.example.demo.model.Food;
import com.example.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
@CrossOrigin(origins = "*")
public class FoodController {

    @Autowired
    private FoodService foodService;

    // 获取所有美食
    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    // 获取推荐美食
    @GetMapping("/recommended")
    public List<Food> getRecommendedFoods() {
        return foodService.getRecommendedFoods();
    }

    // 根据类别获取美食
    @GetMapping("/category/{category}")
    public List<Food> getFoodsByCategory(@PathVariable String category) {
        return foodService.getFoodsByCategory(category);
    }

    // 根据口味类型获取美食
    @GetMapping("/taste/{tasteType}")
    public List<Food> getFoodsByTasteType(@PathVariable String tasteType) {
        return foodService.getFoodsByTasteType(tasteType);
    }

    // 根据地区获取美食
    @GetMapping("/location/{location}")
    public List<Food> getFoodsByLocation(@PathVariable String location) {
        return foodService.getFoodsByLocation(location);
    }

    // 获取热门美食
    @GetMapping("/popular")
    public List<Food> getPopularFoods() {
        return foodService.getPopularFoods();
    }

    // 添加新美食
    @PostMapping
    public Food addFood(@RequestBody Food food) {
        return foodService.saveFood(food);
    }

    // 更新美食信息
    @PutMapping("/{id}")
    public Food updateFood(@PathVariable Long id, @RequestBody Food food) {
        food.setId(id);
        return foodService.saveFood(food);
    }

    // 删除美食
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
        return ResponseEntity.ok().build();
    }
} 