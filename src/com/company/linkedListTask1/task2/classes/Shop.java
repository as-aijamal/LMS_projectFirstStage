package com.company.linkedListTask1.task2.classes;

import java.util.List;

public class Shop {

    private String shopName;
    private String address;
    private List<Client> clients;

    public Shop(String shopName, String address, List<Client> clients) {
        this.shopName = shopName;
        this.address = address;
        this.clients = clients;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                ", clients=" + clients +
                '}';
    }
}
