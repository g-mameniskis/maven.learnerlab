package com.github.curriculeon;

public class Student extends Person implements Learner {

    double totalStudyTime;

    // Wasn't sure about this but IntelliJ fixed the error by adding
    public Student(String name) {
        super(name);
    }

    public void learn(double numberOfHours) {

        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {

        return totalStudyTime;
    }
}
