package com.company.linkedListTask1.task2.classes.comparator;

import com.company.linkedListTask1.task2.classes.Client;

import java.util.Comparator;

public class ClientFirstNameComparator implements Comparator<Client> {

    @Override
    public int compare(Client client1, Client client2) {
        return client1.getPassport().getFirstName().compareTo(client2.getPassport().getFirstName());
    }
}
