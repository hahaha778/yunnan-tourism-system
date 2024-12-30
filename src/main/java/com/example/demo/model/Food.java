package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;            // 美食名称
    private String description;     // 美食描述
    private String location;        // 地理位置
    private String category;        // 分类（如：小吃、主食等）
    private Double price;           // 参考价格
    private String imageUrl;        // 图片URL
    private Integer popularity;     // 受欢迎程度
    private String tasteType;       // 口味类型（如：酸、甜、辣等）
    private String cookingMethod;   // 烹饪方法
    private Boolean isRecommended;  // 是否推荐
    private String seasonality;     // 季节性（什么季节最佳）
} 