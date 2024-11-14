package model;

import java.io.Serializable;
import java.util.*;

public class FamilyTree implements Serializable, Iterable<Person> {
    private static final long serialVersionUID = 1L;
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }

    // Сортировка по имени
    public void sortByName() {
        people.sort(Comparator.comparing(Person::getName));
    }

    // Сортировка по году рождения
    public void sortByBirthYear() {
        people.sort(Comparator.comparingInt(Person::getBirthYear));
    }
}
