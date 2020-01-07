package com.github.curriculeon;

// not entirely sure if I should "extend" an interface but this fixed error
interface Teacher extends Learner {

    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
