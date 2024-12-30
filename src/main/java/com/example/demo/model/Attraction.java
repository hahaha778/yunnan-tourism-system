package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "attractions")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;            // 景点名称
    private String description;     // 景点描述
    private String location;        // 地理位置
    private String category;        // 分类（如：自然景观、人文景点等）
    private Double ticketPrice;     // 门票价格
    private String imageUrl;        // 图片URL
    private Integer popularity;     // 受欢迎程度
    private String bestSeason;      // 最佳游玩季节
    private String openingHours;    // 开放时间
    private Boolean isRecommended;  // 是否推荐
    private String tips;            // 游玩提示
    private String transportation;  // 交通方式
} 