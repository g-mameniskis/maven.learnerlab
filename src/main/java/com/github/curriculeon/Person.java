package com.github.curriculeon;

public class Person {

    private final long ID = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    private String name;

   public Person(String name) {
        this.setName(name);
   }

    public long getId() { return this.ID; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

}
