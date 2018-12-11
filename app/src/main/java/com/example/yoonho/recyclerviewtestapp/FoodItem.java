package com.example.yoonho.recyclerviewtestapp;

public class FoodItem {

    String img;
    String name;
    int minPrice;
    int maxPrice;


    public FoodItem(String img, String name, int minPrice, int maxPrice) {
        this.img = img;
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }
}
