package com.example.demo.repository;

import com.example.demo.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByIsRecommendedTrue();
    List<Food> findByCategory(String category);
    List<Food> findByTasteType(String tasteType);
    List<Food> findByLocationContaining(String location);
    
    @Query("SELECT f FROM Food f WHERE f.popularity >= :minPopularity")
    List<Food> findPopularFoods(Integer minPopularity);
} 