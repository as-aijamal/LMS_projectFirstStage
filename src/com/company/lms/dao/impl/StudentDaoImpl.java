package com.company.lms.dao.impl;

import com.company.lms.dao.StudentDao;
import com.company.lms.db.Database;
import com.company.lms.model.Person;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

   Database database=new Database();



    @Override
    public Person addStudent(Person student) {

        return null;
    }

    @Override
    public List<Person> getAllStudents() {
        //return people;
        return database.getPeople();
    }

    @Override
    public Person getStudentById(int id) {
        return null;
    }

    @Override
    public Person getStudentByName(String name) {
        return null;
    }

    @Override
    public Person updateStudent(int id, Person person) {
        return null;
    }

    @Override
    public String deleteStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentByName() {

    }
}
