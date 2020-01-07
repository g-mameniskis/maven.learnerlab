package com.github.curriculeon;

interface Teacher {

    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
