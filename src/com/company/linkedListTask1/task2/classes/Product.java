package com.company.linkedListTask1.task2.classes;

import java.time.LocalDate;

public class Product {

    private String productName;
    private int price;
    private int countOfProduct;
    private boolean isAlcohol;

    public Product(String productName, int price, int countOfProduct, boolean isAlcohol) {
        this.productName = productName;
        this.price = price;
        this.countOfProduct = countOfProduct;
        this.isAlcohol = isAlcohol;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", countOfProduct=" + countOfProduct +
                ", isAlcohol=" + isAlcohol +
                '}';
    }
}
