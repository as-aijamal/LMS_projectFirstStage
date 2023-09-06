package com.company.lms.db;

import com.company.lms.model.Person;

import java.util.List;

public class Database {

    List<Person> people;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
