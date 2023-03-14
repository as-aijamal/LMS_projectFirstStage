package com.company.lmsVersion1.service;

import com.company.lmsVersion1.classes.Group;
import com.company.lmsVersion1.classes.Lesson;
import com.company.lmsVersion1.classes.Person;

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
