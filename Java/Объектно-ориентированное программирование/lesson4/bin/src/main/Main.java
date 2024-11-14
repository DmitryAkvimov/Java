package main;
import model.FamilyTree;
import model.Person;
import service.FileOperations;
import service.FileoperationsImpl;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        CommandManager manager = new CommandManager(familyTree);

        // Пример добавления людей в дерево
        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
        susan.setMother(mary);
        susan.setFather(john);
        familyTree.addMember(john);
        familyTree.addMember(mary);
        familyTree.addMember(susan);

        // Запуск командного интерфейса
        manager.start();
    }
}
