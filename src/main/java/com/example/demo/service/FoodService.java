package com.example.demo.service;

import com.example.demo.model.Food;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService {
    
    @Autowired
    private FoodRepository foodRepository;

    // 获取所有美食
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    // 获取推荐美食
    public List<Food> getRecommendedFoods() {
        return foodRepository.findByIsRecommendedTrue();
    }

    // 根据类别获取美食
    public List<Food> getFoodsByCategory(String category) {
        return foodRepository.findByCategory(category);
    }

    // 根据口味类型获取美食
    public List<Food> getFoodsByTasteType(String tasteType) {
        return foodRepository.findByTasteType(tasteType);
    }

    // 根据地区获取美食
    public List<Food> getFoodsByLocation(String location) {
        return foodRepository.findByLocationContaining(location);
    }

    // 获取热门美食
    public List<Food> getPopularFoods() {
        return foodRepository.findPopularFoods(8); // 假设人气值大于8的为热门美食
    }

    // 添加或更新美食
    public Food saveFood(Food food) {
        return foodRepository.save(food);
    }

    // 删除美食
    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
} 