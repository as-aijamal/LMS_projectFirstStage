package com.company.lms.service.impl;

import com.company.lms.dao.StudentDao;
import com.company.lms.dao.impl.StudentDaoImpl;
import com.company.lms.model.Person;
import com.company.lms.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public Person addStudent(Person student) {
        return studentDao.addStudent(student);
    }

    @Override
    public List<Person> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Person getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public Person getStudentByName(String name) {
        return studentDao.getStudentByName(name);
    }

    @Override
    public Person updateStudent(int id, Person person) {
        return studentDao.updateStudent(id, person);
    }

    @Override
    public String deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public void deleteStudentByName() {
        studentDao.deleteStudentByName();
    }


}
