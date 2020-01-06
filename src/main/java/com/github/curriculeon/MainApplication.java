package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Person person = new Person("Montaniz");
        System.out.println("Name: " + person.getName() + " ID: " + person.getId());
        Person person2 = new Person("Grayson");
        System.out.println("Name: " + person2.getName() + " ID: " + person2.getId());
    }
}
