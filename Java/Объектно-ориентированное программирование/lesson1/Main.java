import java.util.ArrayList;
import java.util.List;

// Класс, представляющий человека
class Person {
    private String name;
    private int birthYear;
    private Person mother;
    private Person father;
    private List<Person> children;

    // Конструктор
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.children = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }
    
    // Получение братьев и сестер
    public List<Person> getSiblings() {
        List<Person> siblings = new ArrayList<>();
        if (mother != null) {
            for (Person child : mother.getChildren()) {
                if (!child.equals(this)) {
                    siblings.add(child);
                }
            }
        }
        if (father != null) {
            for (Person child : father.getChildren()) {
                if (!child.equals(this) && !siblings.contains(child)) {
                    siblings.add(child);
                }
            }
        }
        return siblings;
    }

    // Получение всех предков
    public List<Person> getAncestors() {
        List<Person> ancestors = new ArrayList<>();
        if (mother != null) {
            ancestors.add(mother);
            ancestors.addAll(mother.getAncestors());
        }
        if (father != null) {
            ancestors.add(father);
            ancestors.addAll(father.getAncestors());
        }
        return ancestors;
    }
}

// Класс для работы с генеалогическим древом
class FamilyTree {
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getChildren(Person parent) {
        return parent.getChildren();
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    // Поиск всех предков человека
    public List<Person> getAncestors(Person person) {
        return person.getAncestors();
    }

    // Получение всех братьев и сестер человека
    public List<Person> getSiblings(Person person) {
        return person.getSiblings();
    }
}

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        // Создаем людей
        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
        Person david = new Person("David", 1983);
        Person lisa = new Person("Lisa", 1985);

        // Устанавливаем родительские связи
        susan.setMother(mary);
        susan.setFather(john);
        david.setMother(mary);
        david.setFather(john);
        lisa.setMother(mary);
        lisa.setFather(john);

        john.addChild(susan);
        john.addChild(david);
        john.addChild(lisa);

        mary.addChild(susan);
        mary.addChild(david);
        mary.addChild(lisa);

        // Добавляем людей в древо
        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(susan);
        familyTree.addPerson(david);
        familyTree.addPerson(lisa);

        // Пример получения всех детей Джона
        System.out.println("Children of John:");
        for (Person child : familyTree.getChildren(john)) {
            System.out.println("- " + child.getName());
        }

        // Пример получения братьев и сестер Сьюзан
        System.out.println("\nSiblings of Susan:");
        List<Person> susanSiblings = familyTree.getSiblings(susan);
        for (Person sibling : susanSiblings) {
            System.out.println("- " + sibling.getName());
        }

        // Пример получения всех предков Лизы
        System.out.println("\nAncestors of Lisa:");
        List<Person> lisaAncestors = familyTree.getAncestors(lisa);
        for (Person ancestor : lisaAncestors) {
            System.out.println("- " + ancestor.getName());
        }
    }
}
