# 云南省旅游美食推荐系统

## 项目简介
本系统是一个基于Spring Boot + Vue的云南省旅游美食推荐系统，旨在为用户提供云南省的特色美食和旅游景点推荐服务。

## 技术栈
### 后端
- Spring Boot 3.2.0
- Spring Data JPA
- MySQL 8.0
- Lombok
- Maven

### 前端 (规划中)
- Vue.js
- Element UI
- Axios

## 系统功能
### 美食模块
- 美食列表查询
- 推荐美食查询
- 按类别查询美食
- 按口味类型查询
- 按地区查询美食
- 热门美食推荐
- 美食信息管理（增删改查）

### 景点模块
- 景点列表查询
- 推荐景点查询
- 按类别查询景点
- 按地区查询景点
- 按季节查询景点
- 热门景点推荐
- 景点信息管理（增删改查）

## 数据模型
### 美食(Food)
- id: 主键
- name: 美食名称
- description: 美食描述
- location: 地理位置
- category: 分类
- price: 参考价格
- imageUrl: 图片URL
- popularity: 受欢迎程度
- tasteType: 口味类型
- cookingMethod: 烹饪方法
- isRecommended: 是否推荐
- seasonality: 季节性

### 景点(Attraction)
- id: 主键
- name: 景点名称
- description: 景点描述
- location: 地理位置
- category: 分类
- ticketPrice: 门票价格
- imageUrl: 图片URL
- popularity: 受欢迎程度
- bestSeason: 最佳游玩季节
- openingHours: 开放时间
- isRecommended: 是否推荐
- tips: 游玩提示
- transportation: 交通方式

## API接口
### 美食接口
- GET `/api/foods`: 获取所有美食
- GET `/api/foods/recommended`: 获取推荐美食
- GET `/api/foods/category/{category}`: 根据类别获取美食
- GET `/api/foods/taste/{tasteType}`: 根据口味获取美食
- GET `/api/foods/location/{location}`: 根据地区获取美食
- GET `/api/foods/popular`: 获取热门美食
- POST `/api/foods`: 添加新美食
- PUT `/api/foods/{id}`: 更新美食信息
- DELETE `/api/foods/{id}`: 删除美食

### 景点接口
- GET `/api/attractions`: 获取所有景点
- GET `/api/attractions/recommended`: 获取推荐景点
- GET `/api/attractions/category/{category}`: 根据类别获取景点
- GET `/api/attractions/location/{location}`: 根据地区获取景点
- GET `/api/attractions/season/{season}`: 根据季节获取景点
- GET `/api/attractions/popular`: 获取热门景点
- POST `/api/attractions`: 添加新景点
- PUT `/api/attractions/{id}`: 更新景点信息
- DELETE `/api/attractions/{id}`: 删除景点

## 项目配置
### 数据库配置
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yunnan_tourism
spring.datasource.username=root
spring.datasource.password=root
```

## 开发环境搭建
1. 克隆项目到本地
2. 确保安装了JDK 17
3. 确保安装了MySQL 8.0
4. 创建数据库yunnan_tourism
5. 修改application.properties中的数据库配置
6. 运行项目

## 如何运行
1. 使用IDE打开项目
2. 更新Maven依赖
3. 运行DemoApplication.java
4. 访问 http://localhost:8080 测试API

## 注意事项
- 确保MySQL服务已启动
- 确保数据库用户名和密码配置正确
- 确保使用JDK 17或以上版本 