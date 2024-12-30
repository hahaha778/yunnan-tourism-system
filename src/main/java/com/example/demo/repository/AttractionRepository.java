package com.example.demo.repository;

import com.example.demo.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    List<Attraction> findByIsRecommendedTrue();
    List<Attraction> findByCategory(String category);
    List<Attraction> findByLocationContaining(String location);
    List<Attraction> findByBestSeason(String season);
    
    @Query("SELECT a FROM Attraction a WHERE a.popularity >= :minPopularity")
    List<Attraction> findPopularAttractions(Integer minPopularity);
} 