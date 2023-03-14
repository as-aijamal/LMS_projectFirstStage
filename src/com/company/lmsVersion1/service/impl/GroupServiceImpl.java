package com.company.lmsVersion1.service.impl;

import com.company.lmsVersion1.classes.Group;
import com.company.lmsVersion1.classes.Lesson;
import com.company.lmsVersion1.classes.Person;
import com.company.lmsVersion1.enums.Gender;
import com.company.lmsVersion1.exceptions.MyException;
import com.company.lmsVersion1.service.GroupService;

import java.util.*;

public class GroupServiceImpl implements GroupService {

    private List<Group> groups = new ArrayList<>();

    public GroupServiceImpl(List<Group> groups) {
        this.groups = groups;
    }

    public GroupServiceImpl() {
    }

    @Override
    public String addNewGroup() {
        System.out.print("Жаны группага ат жазыныз: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Группанын сүрөттөмөсүн жазыныз: ");
        String description = new Scanner(System.in).nextLine();
        Group group = new Group(groups.size() + 1, name, description, new LinkedList<>(), new LinkedList<>());
        groups.add(group);
        System.out.println(group.toString());
        return name + " атту группа ийгиликтүү сакталды!";
    }

    @Override
    public Group getGroupByGroupName() {
        Group group = null;
        int counter = 0;
        try {
            System.out.print("Группанын атын жазыныз: ");
            String name = new Scanner(System.in).nextLine().toUpperCase();
            for (Group g : groups) {
                if (g.getGroupName().toUpperCase().trim().equals(name.trim())) {
                    counter++;
                    group = g;
                }
            }

            if (counter > 0) {
                return group;
            } else {
                throw new MyException("Мындай группа табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteGroupByName() {
        Group group = null;
        int counter = 0;
        try {
            System.out.print("Группанын атын жазыныз: ");
            String name = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getGroupName().toUpperCase().equals(name.toUpperCase())) {
                    counter++;
                    group = g;
                }
            }
            if (counter > 0) {
                System.out.println(name + " атту группа ийгиликтүү очурулду!");
                groups.remove(group);
            } else {
                throw new MyException("Мындай группа табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Group updateGroupName() {
        Group group = null;
        int counter = 0;
        try {
            System.out.print("Группанын атын жазыныз: ");
            String name = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getGroupName().toUpperCase().equals(name.toUpperCase())) {
                    counter++;
                    group = g;
                }
            }

            if (counter > 0) {
                System.out.print("Жаны ат жазыныз: ");
                String newName = new Scanner(System.in).nextLine();
                group.setGroupName(newName);
                System.out.println("Группанын аты ийгиликтүү озгорулду!");
                return group;
            } else {
                throw new MyException("Мындай группа табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return groups;
    }

    @Override
    public String getAllStudentsByGroupName() {
        Group group = null;
        int counter = 0;
        System.out.print("Группанын атын жазыныз: ");
        String name = new Scanner(System.in).nextLine();
        for (Group g : groups) {
            if (g.getGroupName().toUpperCase().equals(name.toUpperCase())) {
                counter++;
                group = g;
            }
        }
        if (counter > 0) {
            if (group.getStudents() != null) {
                List<Person> students = new LinkedList<>(group.getStudents());
                if (!students.isEmpty()) {
                    return students.toString();
                } else {
                    return "Группада студенттер жок!";
                }
            }
        }
        return "Мындай группа табылган жок!";
    }

    @Override
    public String addNewStudentToGroup() {
        Person person = null;
        Group group = null;
        int counter = 0;
        try {
            if (groups != null) {
                System.out.print("Кайсы группага студент кошосуз, ошол группанын атын жазыныз: ");
                String groupName = new Scanner(System.in).nextLine();
                for (Group g : groups) {
                    if (g.getGroupName().toUpperCase().equals(groupName.toUpperCase())) {
                        counter++;
                        group = g;
                    }
                }

                if (counter > 0) {
                    System.out.print("Студенттин атын жазыныз: ");
                    String firstName = new Scanner(System.in).nextLine();
                    if (firstName.isBlank()) {
                        throw new MyException("Студенттин атын жазыныз!");
                    }
                    System.out.print("Фамилиясын жазыныз: ");
                    String lastName = new Scanner(System.in).nextLine();
                    if (lastName.isBlank()) {
                        throw new MyException("Фамилиясын жазыныз!");
                    }
                    System.out.print("Электрондук почтасын жазыныз: ");
                    String email = new Scanner(System.in).nextLine();
                    if (email.isBlank()) {
                        throw new MyException("Электрондук почтасын жазыныз!");
                    }

                    if (group.getStudents() != null) {
                        if (!group.getStudents().isEmpty()) {
                            for (Person p : group.getStudents()) {
                                if (p.getEmail().equals(email)) {
                                    throw new MyException("Мындай электрондук почта биздин базада бар, башка почта жазып корунуз!");
                                }
                            }
                        }
                    }

                    System.out.print("Пароль ойлоп табыныз(узундугу 7 символдон аз болбосун): ");
                    String password = new Scanner(System.in).nextLine();
                    if (password.length() < 7) {
                        throw new MyException("Парольдун узундугу 7 символдон аз болбосун!");
                    }

                    System.out.print("Жынысын жазыныз(male/female): ");
                    String gender = new Scanner(System.in).nextLine();
                    if (gender.toUpperCase().equals(Gender.FEMALE.name())) {
                        person = new Person(group.getStudents().size() + 1, firstName, lastName, email, password, Gender.FEMALE);
                        group.addStudent(person);
                        System.out.println(person.toString());
                        return "Жаны студент ийгиликтуу кошулду!";
                    } else if (gender.toUpperCase().equals(Gender.MALE.name())) {
                        person = new Person(group.getStudents().size() + 1, firstName, lastName, email, password, Gender.MALE);
                        group.addStudent(person);
                        System.out.println(person.toString());
                        return "Жаны студент ийгиликтуу кошулду!";
                    } else {
                        throw new MyException("Туура эмес маалымат!");
                    }
                } else {
                    throw new MyException("Мындай группа табылган жок!");
                }
            } else {
                throw new MyException("Сизде группа жок, биринчи группа кошунуз!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String addNewLessonToGroup() {
        Group g = null;
        int counter = 0;
        try {
            if (groups != null) {
                System.out.print("Группанын атын жазыңыз: ");
                String name = new Scanner(System.in).nextLine();
                for (Group group : groups) {
                    if (group.getGroupName().toUpperCase().equals(name.toUpperCase())) {
                        counter++;
                        g = group;
                    }
                }

                if (counter > 0) {
                    System.out.print("Сабактын атын жазыңыз: ");
                    String lessonName = new Scanner(System.in).nextLine();
                    System.out.print("Тапшырманын сүрөттөмөсүн жазыңыз: ");
                    String task = new Scanner(System.in).nextLine();
                    Lesson lesson = new Lesson(g.getLessons().size() + 1, lessonName, task);
                    g.addLesson(lesson);
                    System.out.println(lesson.toString());
                    return "Сабак ийгиликтуу сакталды!";
                } else {
                    return "Мындай группа табылган жок!";
                }
            } else {
                throw new MyException("Сизде группа жок, биринчи группа кошунуз!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteLessonByName() {
        Lesson lesson = null;
        Group group = null;
        int counter = 0;
        try {
            System.out.print("Сабактын атын жазыныз: ");
            String name = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getLessons() != null) {
                    for (Lesson l : g.getLessons()) {
                        if (l.getLessonName().toUpperCase().equals(name.toUpperCase())) {
                            counter++;
                            lesson = l;
                            group = g;
                        }
                    }
                } else {
                    throw new MyException("Бул группада сабактар жок!");
                }
            }

            if (counter > 0) {
                group.getLessons().remove(lesson);
                System.out.println("Сабак ийгиликтуу очту!");
            } else {
                throw new MyException("Мындай сабак табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Lesson> getAllStudentLessonByStudentEmail() {
        int counter = 0;
        Group group = null;
        System.out.print("Студенттин почтасын жазыныз: ");
        try {
            String email = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                for (Person p : g.getStudents()) {
                    if (p.getEmail().toUpperCase().equals(email.toUpperCase())) {
                        counter++;
                        group = g;
                    }
                }
            }
            if (counter > 0) {
                if (group.getLessons() != null) {
                    List<Lesson> lessons = new LinkedList<>(group.getLessons());
                    return lessons;
                } else {
                    throw new MyException("Группада сабактар жок!");
                }
            } else {
                throw new MyException("Мындай почта менен эч ким табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Lesson> getAllGroupLessons() {
        List<Lesson> lessons = new LinkedList<>();
        Group group = null;
        int counter = 0;
        try {
            if (groups != null) {
                System.out.print("Группанын атын жазыңыз: ");
                String name = new Scanner(System.in).nextLine();
                for (Group g : groups) {
                    if (name.toUpperCase().equals(g.getGroupName().toUpperCase())) {
                        counter++;
                        group = g;
                    }
                }

                if (counter > 0) {
                    if (group.getLessons() != null) {
                        lessons.addAll(group.getLessons());
                    } else {
                        throw new MyException("Бул группада сабактар жок!");
                    }
                } else {
                    throw new MyException("Мындай группа табылган жок!");
                }
            } else {
                throw new MyException("Сизде группа жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return lessons;
    }

    @Override
    public void deleteStudentFromGroupByEmail() {
        Person p = null;
        int counter = 0;
        Group group = null;
        try {
            System.out.print("Кимди очуросуз, ошол адамдын почтасын жазыныз: ");
            String email = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                for (Person person : g.getStudents()) {
                    if (email.toUpperCase().equals(person.getEmail().toUpperCase())) {
                        counter++;
                        p = person;
                        group = g;
                    }
                }
            }
            if (counter > 0) {
                group.getStudents().remove(p);
                System.out.println("Почтасы " + email + " болгон студент ийгиликтүү очурулду!");
            } else {
                throw new MyException("Мындай почта менен эч ким табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Person update() {
        Person person = null;
        int counter = 0;
        System.out.print("Почтанызды жазыныз: ");
        String email = new Scanner(System.in).nextLine().trim();
        System.out.print("Пароль жазыныз: ");
        String password = new Scanner(System.in).nextLine().trim();
        for (Group group : groups) {
            for (Person p : group.getStudents()) {
                if (p.getEmail().equals(email) && p.getPassword().equals(password)) {
                    counter++;
                    person = p;
                }
            }
        }

        if (counter > 0) {
            System.out.print("Жаны ат жазыныз: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Жаны фамилия жазыныз: ");
            String lastName = new Scanner(System.in).nextLine();
            person.setFirstName(name);
            person.setLastName(lastName);
            System.out.println("Сиздин атыныз жана фамилияныз ийгиликтуу озгорду!");
            return person;
        } else {
            System.out.println("Почта же пароль туура эмес!");
        }
        return null;
    }


    @Override
    public void findStudentByFirstName() {
        Person p = null;
        int counter = 0;
        System.out.print("Студенттин атын жазыныз: ");
        String name = new Scanner(System.in).nextLine();
        for (Group g : groups) {
            for (Person person : g.getStudents()) {
                if (person.getFirstName().toUpperCase().trim().equals(name.toUpperCase().trim())) {
                    counter++;
                    p = person;
                }
            }
        }

        if (counter > 0) {
            System.out.println(p.toString());
        } else {
            System.out.println(name + " атту студент табылган жок!");
        }
    }

    @Override
    public Lesson getLessonByLessonName() {
        Lesson lesson = null;
        int counter = 0;
        try {
            System.out.print("Сабактын атын жазыңыз: ");
            String name = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                for (Lesson l : g.getLessons()) {
                    if (l.getLessonName().toUpperCase().equals(name.toUpperCase())) {
                        lesson = l;
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                return lesson;
            } else {
                throw new MyException("Мындай ат менен сабак табылган жок!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}