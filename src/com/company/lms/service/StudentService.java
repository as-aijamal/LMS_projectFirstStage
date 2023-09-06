package com.company.lms.service;

import com.company.lms.model.Person;

import java.util.List;
import java.util.Scanner;

public interface StudentService {

    Person addStudent(Person student);

    List<Person> getAllStudents();

    Person getStudentById(int id);

    Person getStudentByName(String name);


    Person updateStudent(int id,Person person);

    String deleteStudentById(int id);
    void  deleteStudentByName();

}
