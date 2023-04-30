package stanislav.danylenko.patterns.structural.composite.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.patterns.structural.composite.TerritoryUnit;

public class Area implements TerritoryUnit {

    private final List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    @Override
    public int getCountOfPeople() {
        return people.size();
    }

}
