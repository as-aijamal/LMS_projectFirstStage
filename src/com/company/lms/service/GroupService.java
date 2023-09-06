package com.company.lms.service;

import com.company.lms.model.Group;
import com.company.lms.model.Lesson;
import com.company.lms.model.Person;

import java.util.List;

public interface GroupService {

    String addNewGroup();

    Group getGroupByGroupName();

    void deleteGroupByName();

    Group updateGroupName();

    List<Group> getAllGroups();

    String getAllStudentsByGroupName();

    String addNewStudentToGroup();

    String addNewLessonToGroup();

    List<Lesson> getAllGroupLessons();

    void deleteLessonByName();

    List<Lesson> getAllStudentLessonByStudentEmail();

    void deleteStudentFromGroupByEmail();

    void findStudentByFirstName();

    Person update();

    Lesson getLessonByLessonName();
}
