package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class People {

// <<< FIELD >>> ---------------------------------------------------
    List<Person> personlist = new ArrayList<>();

// <<< METHOD >>> --------------------------------------------------
    public void add(Person person) {
        personlist.add(person);
    }

    public void findById(long id) {
        personlist.get();
    }
}
