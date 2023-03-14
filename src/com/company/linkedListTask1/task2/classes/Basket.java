package com.company.linkedListTask1.task2.classes;

import java.util.List;

public class Basket {

    private List<Product> products;

    public Basket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
