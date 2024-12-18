package com.example.demo.vo;

import java.util.List;

public class Product {
    private int id;
    private String productId; // 사용하지 않을 경우 제거해도 됩니다
    private String name;
    private int price;
    private String category; // 카테고리 추가
    private List<String> sizes; // 사이즈 리스트
    private List<String> colors; // 색상 리스트
    private List<ProductReview> reviews; // 리뷰 리스트
    private String description; // 상품 설명

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category; // 카테고리의 getter
    }

    public void setCategory(String category) {
        this.category = category; // 카테고리의 setter
    }

    public List<String> getSizes() {
        return sizes; // 사이즈 리스트 getter
    }

    public void setSizes(List<String> sizes) {
        this.sizes = sizes; // 사이즈 리스트 setter
    }

    public List<String> getColors() {
        return colors; // 색상 리스트 getter
    }

    public void setColors(List<String> colors) {
        this.colors = colors; // 색상 리스트 setter
    }

    public List<ProductReview> getReviews() {
        return reviews; // 리뷰 리스트 getter
    }

    public void setReviews(List<ProductReview> reviews) {
        this.reviews = reviews; // 리뷰 리스트 setter
    }

    public String getDescription() {
        return description; // 상품 설명 getter
    }

    public void setDescription(String description) {
        this.description = description; // 상품 설명 setter
    }
}