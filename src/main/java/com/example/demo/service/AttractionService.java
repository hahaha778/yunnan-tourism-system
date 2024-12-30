package com.example.demo.service;

import com.example.demo.model.Attraction;
import com.example.demo.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AttractionService {
    
    @Autowired
    private AttractionRepository attractionRepository;

    // 获取所有景点
    public List<Attraction> getAllAttractions() {
        return attractionRepository.findAll();
    }

    // 获取推荐景点
    public List<Attraction> getRecommendedAttractions() {
        return attractionRepository.findByIsRecommendedTrue();
    }

    // 根据类别获取景点
    public List<Attraction> getAttractionsByCategory(String category) {
        return attractionRepository.findByCategory(category);
    }

    // 根据地区获取景点
    public List<Attraction> getAttractionsByLocation(String location) {
        return attractionRepository.findByLocationContaining(location);
    }

    // 根据季节获取景点
    public List<Attraction> getAttractionsBySeason(String season) {
        return attractionRepository.findByBestSeason(season);
    }

    // 获取热门景点
    public List<Attraction> getPopularAttractions() {
        return attractionRepository.findPopularAttractions(8); // 假设人气值大于8的为热门景点
    }

    // 添加或更新景点
    public Attraction saveAttraction(Attraction attraction) {
        return attractionRepository.save(attraction);
    }

    // 删除景点
    public void deleteAttraction(Long id) {
        attractionRepository.deleteById(id);
    }
} 