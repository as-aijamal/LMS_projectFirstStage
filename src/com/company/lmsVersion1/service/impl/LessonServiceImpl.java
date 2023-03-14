package com.company.lmsVersion1.service.impl;

import com.company.lmsVersion1.classes.Lesson;
import com.company.lmsVersion1.exceptions.MyException;
import com.company.lmsVersion1.service.LessonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessonServiceImpl implements LessonService {

    private List<Lesson> lessons = new ArrayList<>();

    public LessonServiceImpl(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public LessonServiceImpl() {
    }


}
