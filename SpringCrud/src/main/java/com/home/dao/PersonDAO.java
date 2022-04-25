package com.home.dao;

import com.home.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int COUNT_PEOPLE;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++COUNT_PEOPLE, "David"));
        people.add(new Person(++COUNT_PEOPLE, "Geronimo"));
        people.add(new Person(++COUNT_PEOPLE, "Steve"));
        people.add(new Person(++COUNT_PEOPLE, "Bill"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
