package com.company.lms;
import com.company.lms.model.Person;
import com.company.lms.exceptions.MyException;
import com.company.lms.service.impl.GroupServiceImpl;
import com.company.lms.service.impl.LessonServiceImpl;
import com.company.lms.service.impl.PersonServiceImpl;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        if (time.isAfter(LocalTime.of(6, 0, 0)) && time.isBefore(LocalTime.of(12, 0, 0))) {
            String[] now = time.toString().split(":", 3);
            System.out.println("   Кутман тан! Саат -> " + now[0] + ":" + now[1]);
        } else if (time.isAfter(LocalTime.of(12, 0, 0)) && time.isBefore(LocalTime.of(18, 0, 0))) {
            String[] now = time.toString().split(":", 3);
            System.out.println("   Кутман кун! Саат -> " + now[0] + ":" + now[1]);
        } else {
            String[] now = time.toString().split(":", 3);
            System.out.println("   Кутман кеч! Саат -> " + now[0] + ":" + now[1]);
        }

        method();

    }
    public static void method() {

        Person person = new Person(1, "Admin", "Adminov", "admin@gmail.com", "admin");
        GroupServiceImpl groupService = new GroupServiceImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
        PersonServiceImpl personService = new PersonServiceImpl(List.of(person));

        while (true) {
            try {
                System.out.println("Катталган болсонуз 1 басыныз, пароль унутуп калып, озгортуу учун 2 басыныз!");
                int login = new Scanner(System.in).nextInt();
                switch (login) {
                    case 1:
                        if (personService.login().equals("Кош келиниз!")) {
                            System.out.println("Кош келиниз!");
                            while (true) {
                                System.out.println("   *** Бир команда танданыз! ***");
                                System.out.println("" +
                                        " 1  -> Add new group\n" +
                                        " 2  -> Get group by name\n" +
                                        " 3  -> Update group name\n" +
                                        " 4  -> Get all groups\n" +
                                        " 5  -> Add new student to group\n" +
                                        " 6  -> Update student\n" +
                                        " 7  -> Find student by first name\n" +
                                        " 8  -> Get all students by group name\n" +
                                        " 9  -> Get all student's lesson\n" +
                                        " 10 -> Delete student\n" +
                                        " 11 -> Add new lesson to group\n" +
                                        " 12 -> Get lesson by name\n" +
                                        " 13 -> Get all lesson by group name\n" +
                                        " 14 -> Delete lessonp\n" +
                                        " 15 -> Delete group\n");

                                int command = new Scanner(System.in).nextInt();
                                switch (command) {
                                    case 1 -> System.out.println(groupService.addNewGroup());
                                    case 2 -> System.out.println(groupService.getGroupByGroupName());
                                    case 3 -> System.out.println(groupService.updateGroupName());
                                    case 4 -> System.out.println(groupService.getAllGroups());
                                    case 5 -> System.out.println(groupService.addNewStudentToGroup());
                                    case 6 -> System.out.println(groupService.update());
                                    case 7 -> groupService.findStudentByFirstName();
                                    case 8 -> System.out.println(groupService.getAllStudentsByGroupName());
                                    case 9 -> System.out.println(groupService.getAllStudentLessonByStudentEmail());
                                    case 10 -> groupService.deleteStudentFromGroupByEmail();
                                    case 11 -> System.out.println(groupService.addNewLessonToGroup());
                                    case 12 -> System.out.println(groupService.getLessonByLessonName());
                                    case 13 -> System.out.println(groupService.getAllGroupLessons());
                                    case 14 -> groupService.deleteLessonByName();
                                    case 15 -> groupService.deleteGroupByName();
                                }
                            }
                        } else {
                            throw new MyException("Почта же пароль туура эмес!");
                        }
                    case 2:
                        if (personService.resetPassword().equals("Сиздин пароль ийгиликтуу озгорулду!")) {
                            System.out.println("Сиздин пароль ийгиликтуу озгорулду!");
                            while (true) {
                                System.out.println("   *** Бир команда танданыз! ***");
                                System.out.println("" +
                                        " 1  -> Add new group\n" +
                                        " 2  -> Get group by name\n" +
                                        " 3  -> Update group name\n" +
                                        " 4  -> Get all groups\n" +
                                        " 5  -> Add new student to group\n" +
                                        " 6  -> Update student\n" +
                                        " 7  -> Find student by first name\n" +
                                        " 8  -> Get all students by group name\n" +
                                        " 9  -> Get all student's lesson\n" +
                                        " 10 -> Delete student\n" +
                                        " 11 -> Add new lesson to group\n" +
                                        " 12 -> Get lesson by name\n" +
                                        " 13 -> Get all lesson by group name\n" +
                                        " 14 -> Delete lesson\n" +
                                        " 15 -> Delete group\n");

                                int command = new Scanner(System.in).nextInt();
                                switch (command) {
                                    case 1 -> System.out.println(groupService.addNewGroup());
                                    case 2 -> System.out.println(groupService.getGroupByGroupName());
                                    case 3 -> System.out.println(groupService.updateGroupName());
                                    case 4 -> System.out.println(groupService.getAllGroups());
                                    case 5 -> System.out.println(groupService.addNewStudentToGroup());
                                    case 6 -> System.out.println(groupService.update());
                                    case 7 -> groupService.findStudentByFirstName();
                                    case 8 -> System.out.println(groupService.getAllStudentsByGroupName());
                                    case 9 -> System.out.println(groupService.getAllStudentLessonByStudentEmail());
                                    case 10 -> groupService.deleteStudentFromGroupByEmail();
                                    case 11 -> System.out.println(groupService.addNewLessonToGroup());
                                    case 12 -> System.out.println(groupService.getLessonByLessonName());
                                    case 13 -> System.out.println(groupService.getAllGroupLessons());
                                    case 14 -> groupService.deleteLessonByName();
                                    case 15 -> groupService.deleteGroupByName();
                                }
                            }
                        } else {
                            throw new MyException("Пароль катаа!");
                        }
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}