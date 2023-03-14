package com.company.lmsVersion1.service.impl;

import com.company.lmsVersion1.classes.Person;
import com.company.lmsVersion1.exceptions.MyException;
import com.company.lmsVersion1.service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {

    private List<Person> people = new ArrayList<>();

    public PersonServiceImpl() {
    }

    public PersonServiceImpl(List<Person> people) {
        this.people = people;
    }

    //    @Override
//    public Person registration() {
//        Person person = null;
//        try {
//            LocalTime time = LocalDateTime.now().toLocalTime();
//            if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(12, 0))) {
//                System.out.println("Кутман тан! \nБизден PeaksoftLMS'ге каттоолуу учун -> ");
//                System.out.print("Атынызды жазыныз: ");
//                String firstName = new Scanner(System.in).nextLine();
//                if (firstName.isBlank()) {
//                    throw new MyException("Атынызды жазыныз!");
//                }
//                System.out.print("Фамилиянызды жазыныз: ");
//                String lastName = new Scanner(System.in).nextLine();
//                if (lastName.isBlank()) {
//                    throw new MyException("Фамилиянызды жазыныз!");
//                }
//
//                System.out.print("Электрондук почтанызды жазыныз: ");
//                String email = new Scanner(System.in).nextLine();
//                if (email.isBlank()) {
//                    throw new MyException("Электрондук почтанызды жазыныз!");
//                }
//
//                if (!people.isEmpty()) {
//                    for (Person p : people) {
//                        if (p.getEmail().equals(email)) {
//                            throw new MyException("Мындай электрондук почта биздин базада бар, башка почта жазып корунуз!");
//                        }
//                    }
//                }
//
//                System.out.print("Пароль ойлоп табыныз(узундугу 7 символдон аз болбосун): ");
//                String password = new Scanner(System.in).nextLine();
//                if (password.length() < 7) {
//                    throw new MyException("Парольдун узундугу 7 символдон аз болбосун!");
//                }
//
//                System.out.print("Жынысынызды жазыныз(male/female): ");
//                String gender = new Scanner(System.in).nextLine();
//                if (gender.toUpperCase().equals(Gender.FEMALE.name())) {
//                    person = new Person(people.size() + 1, firstName, lastName, email, password, Gender.FEMALE);
//                } else if (gender.toUpperCase().equals(Gender.MALE.name())) {
//                    person = new Person(people.size() + 1, firstName, lastName, email, password, Gender.MALE);
//                } else {
//                    throw new MyException("Туура эмес маалымат!");
//                }
//            } else if (time.isAfter(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(18, 0))) {
//                System.out.println("Кутман кун! \nБизден PeaksoftLMS'ге каттоолуу учун -> ");
//                System.out.print("Атынызды жазыныз: ");
//                String firstName = new Scanner(System.in).nextLine();
//                if (firstName.isBlank()) {
//                    throw new MyException("Атынызды жазыныз!");
//                }
//                System.out.print("Фамилиянызды жазыныз: ");
//                String lastName = new Scanner(System.in).nextLine();
//                if (lastName.isBlank()) {
//                    throw new MyException("Фамилиянызды жазыныз!");
//                }
//
//                System.out.print("Электрондук почтанызды жазыныз: ");
//                String email = new Scanner(System.in).nextLine();
//                if (email.isBlank()) {
//                    throw new MyException("Электрондук почтанызды жазыныз!");
//                }
//
//                if (!people.isEmpty()) {
//                    for (Person p : people) {
//                        if (p.getEmail().equals(email)) {
//                            throw new MyException("Мындай электрондук почта биздин базада бар, башка почта жазып корунуз!");
//                        }
//                    }
//                }
//
//                System.out.print("Пароль ойлоп табыныз(узундугу 7 символдон аз болбосун): ");
//                String password = new Scanner(System.in).nextLine();
//                if (password.length() < 7) {
//                    throw new MyException("Парольдун узундугу 7 символдон аз болбосун!");
//                }
//
//                System.out.print("Жынысынызды жазыныз(male/female): ");
//                String gender = new Scanner(System.in).nextLine();
//                if (gender.toUpperCase().equals(Gender.FEMALE.name())) {
//                    person = new Person(people.size() + 1, firstName, lastName, email, password, Gender.FEMALE);
//                } else if (gender.toUpperCase().equals(Gender.MALE.name())) {
//                    person = new Person(people.size() + 1, firstName, lastName, email, password, Gender.MALE);
//                } else {
//                    throw new MyException("Туура эмес маалымат!");
//                }
//            } else if (time.isAfter(LocalTime.of(18, 0)) && time.isBefore(LocalTime.of(6, 0))) {
//                System.out.println("Кутман кеч! \nБизден PeaksoftLMS'ге каттоолуу учун -> ");
//                System.out.print("Атынызды жазыныз: ");
//                String firstName = new Scanner(System.in).nextLine();
//                if (firstName.isBlank()) {
//                    throw new MyException("Атынызды жазыныз!");
//                }
//                System.out.print("Фамилиянызды жазыныз: ");
//                String lastName = new Scanner(System.in).nextLine();
//                if (lastName.isBlank()) {
//                    throw new MyException("Фамилиянызды жазыныз!");
//                }
//
//                System.out.print("Электрондук почтанызды жазыныз: ");
//                String email = new Scanner(System.in).nextLine();
//                if (email.isBlank()) {
//                    throw new MyException("Электрондук почтанызды жазыныз!");
//                }
//
//                if (!people.isEmpty()) {
//                    for (Person p : people) {
//                        if (p.getEmail().equals(email)) {
//                            throw new MyException("Мындай электрондук почта биздин базада бар, башка почта жазып корунуз!");
//                        }
//                    }
//                }
//
//                System.out.print("Пароль ойлоп табыныз(узундугу 7 символдон аз болбосун): ");
//                String password = new Scanner(System.in).nextLine();
//                if (password.length() < 7) {
//                    throw new MyException("Парольдун узундугу 7 символдон аз болбосун!");
//                }
//
//                System.out.print("Жынысынызды жазыныз(male/female): ");
//                String gender = new Scanner(System.in).nextLine();
//                if (gender.toUpperCase().equals(Gender.FEMALE.name())) {
//                    person = new Person(people.size() + 1, firstName, lastName, email, password, Gender.FEMALE);
//                } else if (gender.toUpperCase().equals(Gender.MALE.name())) {
//                    person = new Person(people.size() + 1, firstName, lastName, email, password, Gender.MALE);
//                } else {
//                    throw new MyException("Туура эмес маалымат!");
//                }
//            }
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Сиз катоодон ийгиликтуу оттунуз!");
//        people.add(person);
//        return person;
//    }

    @Override
    public String login() {
        System.out.println("Кирүү үчүн электрондук почтаңызды жана паролуңузду жазыныз!");
        System.out.print("Электрондук почтанызды жазыныз: ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("Пароль жазыныз: ");
        String password = new Scanner(System.in).nextLine();

        for (Person p : people) {
            if (p.getEmail().equals(email) && p.getPassword().equals(password)) {
                return "Кош келиниз!";
            }
            return "Электрондук почта же пароль туура эмес!";
        }
        return "Электрондук почта же пароль туура эмес!";
    }

    @Override
    public String resetPassword() {
        System.out.print("Пароль озгортуу учун почтанызды жазыныз: ");
        String email = new Scanner(System.in).nextLine();
        for (Person p : people) {
            if (p.getEmail().equals(email)) {
                System.out.print("Жаны пароль жазыныз(узундугу 7 символдон аз болбосун): ");
                String password = new Scanner(System.in).nextLine();
                if (password.length() < 7) {
                    return "Парольдун узундугу 7 символдон аз болбосун!";
                } else {
                    p.setPassword(password);
                    System.out.println(p.toString());
                    return "Сиздин пароль ийгиликтуу озгорулду!";
                }
            } else {
                return "Мындай почта табылган жок!";
            }
        }
        return "Парольдун узундугу 7 символдон аз болбосун!";
    }

//    @Override
//    public Person changeRole() {
//        System.out.print("Почтанызды жазыныз: ");
//        String email = new Scanner(System.in).nextLine();
//        System.out.print("Пароль жазыныз: ");
//        String password = new Scanner(System.in).nextLine();
//        try {
//            for (Person p : people) {
//                if (p.getEmail().equals(email) && p.getPassword().equals(password)) {
//                    if (p.getRole().equals(Role.ADMIN)) {
//                        System.out.print("Кимдин ролюн озгортууну каалайсыз, ошол адамдын атын жазыныз: ");
//                        String name = new Scanner(System.in).nextLine();
//                        for (Person person : people) {
//                            if (person.getFirstName().toUpperCase().equals(name.toUpperCase())) {
//                                System.out.print("Кандай роль бересиз admin/mentor/student: ");
//                                String role = new Scanner(System.in).nextLine().toUpperCase();
//                                if (role.equals(Role.ADMIN.name())) {
//                                    person.setRole(Role.ADMIN);
//                                    System.out.println(person.getFirstName() + "дин ролю озгорду!");
//                                    return person;
//                                } else if (role.equals(Role.MENTOR.name())) {
//                                    person.setRole(Role.MENTOR);
//                                    System.out.println(person.getFirstName() + "дин ролю озгорду!");
//                                    return person;
//                                } else if (role.equals(Role.STUDENT.name())) {
//                                    System.out.println(person.getFirstName() + "дин ролю озгорду!");
//                                    return person;
//                                } else {
//                                    throw new MyException("Туура эмес маалымат!");
//                                }
//                            } else {
//                                throw new MyException("Мындай ат менен эч ким табылган жок!");
//                            }
//                        }
//                    } else {
//                        throw new MyException("Cиз эч кимдин ролюн озгорто албайсыз, анткени сиз АДМИН эмессиз!");
//                    }
//                } else {
//                    throw new MyException("Почта же пароль туура эмес!");
//                }
//            }
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }
}
