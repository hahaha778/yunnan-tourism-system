package com.example.demo.controller;

import com.example.demo.model.Attraction;
import com.example.demo.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attractions")
@CrossOrigin(origins = "*")
public class AttractionController {

    @Autowired
    private AttractionService attractionService;

    // 获取所有景点
    @GetMapping
    public List<Attraction> getAllAttractions() {
        return attractionService.getAllAttractions();
    }

    // 获取推荐景点
    @GetMapping("/recommended")
    public List<Attraction> getRecommendedAttractions() {
        return attractionService.getRecommendedAttractions();
    }

    // 根据类别获取景点
    @GetMapping("/category/{category}")
    public List<Attraction> getAttractionsByCategory(@PathVariable String category) {
        return attractionService.getAttractionsByCategory(category);
    }

    // 根据地区获取景点
    @GetMapping("/location/{location}")
    public List<Attraction> getAttractionsByLocation(@PathVariable String location) {
        return attractionService.getAttractionsByLocation(location);
    }

    // 根据季节获取景点
    @GetMapping("/season/{season}")
    public List<Attraction> getAttractionsBySeason(@PathVariable String season) {
        return attractionService.getAttractionsBySeason(season);
    }

    // 获取热门景点
    @GetMapping("/popular")
    public List<Attraction> getPopularAttractions() {
        return attractionService.getPopularAttractions();
    }

    // 添加新景点
    @PostMapping
    public Attraction addAttraction(@RequestBody Attraction attraction) {
        return attractionService.saveAttraction(attraction);
    }

    // 更新景点信息
    @PutMapping("/{id}")
    public Attraction updateAttraction(@PathVariable Long id, @RequestBody Attraction attraction) {
        attraction.setId(id);
        return attractionService.saveAttraction(attraction);
    }

    // 删除景点
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAttraction(@PathVariable Long id) {
        attractionService.deleteAttraction(id);
        return ResponseEntity.ok().build();
    }
} 