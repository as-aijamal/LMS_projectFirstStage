package com.company.lmsVersion1;

import com.company.lmsVersion1.classes.Person;
import com.company.lmsVersion1.enums.Gender;
import com.company.lmsVersion1.exceptions.MyException;
import com.company.lmsVersion1.service.impl.GroupServiceImpl;
import com.company.lmsVersion1.service.impl.LessonServiceImpl;
import com.company.lmsVersion1.service.impl.PersonServiceImpl;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
//        Scanner scanner = new Scanner(System.in);
//
//        Person person = new Person(1, "Datka", "Mamatzhanova", "datka@gmail.com", "datka", Gender.FEMALE, new ArrayList<>());
//        GroupServiceImpl groupService = new GroupServiceImpl();
//        LessonServiceImpl lessonService = new LessonServiceImpl();
//        PersonServiceImpl personService = new PersonServiceImpl(List.of(person));


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

//        boolean isTrue = true;
//        while (isTrue) {
//            System.out.println("Катталган болсонуз 1 басыныз, пароль унутуп калып, озгортуу учун 2 басыныз!");
//            int login = new Scanner(System.in).nextInt();
//            switch (login) {
//                case 1:
//
//                    if (personService.login().equals("Кош келиниз!")) {
//
//                    } else {
//            }
//        }

//        while (true) {
//            System.out.println("   *** Бир команда танданыз! ***");
//            System.out.println("" +
//                    " 1  -> Login\n" +
//                    " 2  -> Forget password\n" +
//                    " 3  -> Update student\n" +
//                    " 4  -> Find student\n" +
//                    " 5  -> Delete student from group \n" +
//                    " 6  -> Add new group\n" +
//                    " 7  -> Update group name\n" +
//                    " 8  -> Get all groups\n" +
//                    " 9  -> Get group by name\n" +
//                    " 10 -> Get all students by group name\n" +
//                    " 11 -> Add new student to group\n" +
//                    " 12 -> Delete group\n" +
//                    " 13 -> Add new lesson to group\n" +
//                    " 14 -> Get lesson by name\n" +
//                    " 15 -> Get all student's lesson\n" +
//                    " 16 -> Delete lesson from group\n");
//
//            int command = scanner.nextInt();
//            switch (command) {
//                case 1 -> System.out.println(personService.login());
//                case 2 -> System.out.println(personService.resetPassword());
//                case 3 -> System.out.println(personService.update());
//                case 4 -> System.out.println(personService.findStudentByFirstName());
//                case 5 -> groupService.deleteStudentFromGroupByEmail();
//                case 6 -> System.out.println(groupService.addNewGroup());
//                case 7 -> System.out.println(groupService.updateGroupName());
//                case 8 -> System.out.println(groupService.getAllGroups());
//                case 9 -> System.out.println(groupService.getGroupByGroupName());
//                case 10 -> System.out.println(groupService.getAllStudentsByGroupName());
//                case 11 -> System.out.println(groupService.addNewStudentToGroup());
//                case 12 -> groupService.deleteGroupByName();
//                case 13 -> System.out.println(groupService.addNewLessonToGroup());
//                case 14 -> System.out.println(lessonService.getLessonByLessonName());
//                case 15 -> System.out.println(groupService.getAllStudentLessonByStudentEmail());
//                case 16 -> groupService.deleteLessonByName();
//            }
//        }
    }

    public static void method() {

        Person person = new Person(1, "Datka", "Mamatzhanova", "datka@gmail.com", "datka", Gender.FEMALE);
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
                                        " 10 -> Delete student from group\n" +
                                        " 11 -> Add new lesson to group\n" +
                                        " 12 -> Get lesson by name, some problem\n" +
                                        " 13 -> Get all lesson by group name\n" +
                                        " 14 -> Delete lesson from group\n" +
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
                                        " 10 -> Delete student from group\n" +
                                        " 11 -> Add new lesson to group\n" +
                                        " 12 -> Get lesson by name, some problem\n" +
                                        " 13 -> Get all lesson by group name\n" +
                                        " 14 -> Delete lesson from group\n" +
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
}//  14, 10, 9,