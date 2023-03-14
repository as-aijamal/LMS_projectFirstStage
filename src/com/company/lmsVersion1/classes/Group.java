package com.company.lmsVersion1.classes;

import java.util.LinkedList;
import java.util.List;

public class Group {

    private int id;
    private String groupName;
    private String description;
    private List<Lesson> lessons;
    private List<Person> students;

    public Group(int id, String groupName, String description, List<Lesson> lessons, List<Person> students) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    public void addLesson(Lesson lesson) {
        if (lessons == null) {
            lessons = new LinkedList<>();
        }
        lessons.add(lesson);
    }

    public void addStudent(Person person) {
        if (students == null) {
            students = new LinkedList<>();
        }
        students.add(person);
    }

    @Override
    public String toString() {
        return "  Group:" +
                " \n  id =            " + id +
                ",\n  groupName =    '" + groupName +
                ",\n  description =  '" + description +
                ",\n  lessons =       " + lessons +
                ",\n  students =      " + students;
    }
}
