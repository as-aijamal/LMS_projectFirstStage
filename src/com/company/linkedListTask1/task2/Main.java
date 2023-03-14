package com.company.linkedListTask1.task2;

import com.company.linkedListTask1.task2.classes.Basket;
import com.company.linkedListTask1.task2.classes.Client;
import com.company.linkedListTask1.task2.classes.Passport;
import com.company.linkedListTask1.task2.classes.Product;
import com.company.linkedListTask1.task2.classes.comparator.ClientFirstNameComparator;
import com.company.linkedListTask1.task2.enums.Gender;
import com.company.linkedListTask1.task2.service.impl.ProductServiceImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character>characters = new LinkedList<Character>();
        for (char i ='A';i <='Z';i++) {
            characters.add(i);
        }
        System.out.println(characters);
        LinkedList<Integer>integers = new LinkedList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);
        ArrayList<Character> characters1 = new ArrayList<Character>();
        for (char i = 'Z'; i >= 'A'; i--) {
            characters1.add(i);
        }
        System.out.println(characters1);
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        for (int i = 10; i >= 0; i--) {
            integers1.add(i);
        }
        System.out.println(integers1);

//        Passport passport = new Passport("Mamatzhanova", "Datka", LocalDate.of(2005, 3, 17), Gender.FEMALE);
//        Product product = new Product("Nan", 23, 2, false);
//        Product product1 = new Product("Vodka", 123, 1, true);
//        List<Product> products = new LinkedList<>(List.of(product1, product));
//        Basket basket = new Basket(products);
//        Client client = new Client(passport, 400, basket);
//
//        Passport passport1 = new Passport("Kamilzhanov", "Daniel", LocalDate.of(2005, 9, 23), Gender.MALE);
//        Product product2 = new Product("Nan", 23, 2, false);
//        Product product3 = new Product("Vodka", 123, 1, true);
//        List<Product> products1 = new LinkedList<>(List.of(product2, product3));
//        Basket basket1 = new Basket(products1);
//        Client client1 = new Client(passport1, 200, basket1);
//        List<Client> clients = new LinkedList<>(List.of(client, client1));
//
//        Collections.sort(clients, new ClientFirstNameComparator());
//        System.out.println(clients);
//        ProductServiceImpl productService = new ProductServiceImpl();
//        for (Client c : clients) {
//            System.out.println(productService.checkAndCalculateProducts(c));
//        }
    }
}
