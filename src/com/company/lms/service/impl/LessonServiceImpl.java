package com.company.lms.service.impl;

import com.company.lms.model.Lesson;
import com.company.lms.service.LessonService;

import java.util.ArrayList;
import java.util.List;

public class LessonServiceImpl implements LessonService {

    private List<Lesson> lessons = new ArrayList<>();

    public LessonServiceImpl(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public LessonServiceImpl() {
    }


}
