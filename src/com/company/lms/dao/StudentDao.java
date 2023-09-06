package com.company.lms.dao;

import com.company.lms.model.Person;

import java.util.List;

public interface StudentDao {

    //CRUD

    // C - Create
    Person addStudent(Person student);

    //R - Read

    List<Person> getAllStudents();

    Person getStudentById(int id);

    Person getStudentByName(String name);

    //U - Update

    Person updateStudent(int id,Person person);

    //D - Delete

    String deleteStudentById(int id);
    void  deleteStudentByName();
}
