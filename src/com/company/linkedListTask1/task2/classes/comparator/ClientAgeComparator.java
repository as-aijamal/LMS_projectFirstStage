package com.company.linkedListTask1.task2.classes.comparator;

import com.company.linkedListTask1.task2.classes.Client;
import com.company.linkedListTask1.task2.service.ClientService;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class ClientAgeComparator implements ClientService, Comparator<Client> {

    @Override
    public int calculatePersonAge(Client client) {
        return Period.between(client.getPassport().getDateOfBirth(), LocalDate.now()).getYears();
    }

    @Override
    public int compare(Client client1, Client client2) {
        return calculatePersonAge(client1) - calculatePersonAge(client2);
    }
}
