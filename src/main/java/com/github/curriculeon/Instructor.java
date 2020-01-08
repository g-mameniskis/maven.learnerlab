package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    public Instructor(String name) {
        super(name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner); // not entirely sure how this line works
        }
    }


//    @Override
//    public double getTotalStudyTime() {
//        return 0;
//    }
}
