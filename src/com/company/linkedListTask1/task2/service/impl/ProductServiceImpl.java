package com.company.linkedListTask1.task2.service.impl;

import com.company.linkedListTask1.task2.classes.Basket;
import com.company.linkedListTask1.task2.classes.Client;
import com.company.linkedListTask1.task2.classes.Product;
import com.company.linkedListTask1.task2.service.ClientService;
import com.company.linkedListTask1.task2.service.ProductService;

import java.time.LocalDate;
import java.time.Period;

public class ProductServiceImpl implements ProductService, ClientService {

    @Override
    public int checkAndCalculateProducts(Client client) {
        int totalPrice = 0;
        for (Product p : client.getBasket().getProducts()) {
            if (p.isAlcohol()) {
                if (calculatePersonAge(client) > 18) {
                    System.out.println("Sorry but you can't buy this product, we have valid");
                    client.getBasket().getProducts().remove(p);
                }
            }
        }

        for (Product p : client.getBasket().getProducts()) {
            totalPrice += (p.getPrice() * p.getCountOfProduct());
        }

        return totalPrice;
    }

    @Override
    public int calculatePersonAge(Client client) {
        return Period.between(client.getPassport().getDateOfBirth(), LocalDate.now()).plusMonths(2).getYears();
    }
}
