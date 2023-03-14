package com.company.linkedListTask1.task2.classes;

public class Client {

    private Passport passport;
    private int money;
    private Basket basket;

    public Client(Passport passport, int money, Basket basket) {
        this.passport = passport;
        this.money = money;
        this.basket = basket;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Client{" +
                "passport=" + passport +
                ", money=" + money +
                ", basket=" + basket +
                '}';
    }
}
