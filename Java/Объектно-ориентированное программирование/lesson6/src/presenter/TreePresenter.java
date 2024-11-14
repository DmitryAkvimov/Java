package presenter;

import model.FamilyTree;
import model.Person;
import service.FileOperations;
import view.MessageView;
import view.PersonView;
import view.InputView;

import java.io.IOException;

public class TreePresenter {
    private FamilyTree<Person> familyTree;
    private MessageView messageView;
    private PersonView personView;
    private InputView inputView;
    private FileOperations<Person> fileOperations;

    public TreePresenter(FamilyTree<Person> familyTree, MessageView messageView, 
                         PersonView personView, InputView inputView, 
                         FileOperations<Person> fileOperations) {
        this.familyTree = familyTree;
        this.messageView = messageView;
        this.personView = personView;
        this.inputView = inputView;
        this.fileOperations = fileOperations;
    }

    public void addPerson(String name, int birthYear) {
        Person person = new Person(name, birthYear);
        familyTree.addMember(person);
        messageView.displayMessage("Person added: " + name);
    }

    public void showAllPersons() {
        personView.displayPersons(familyTree.getMembers());
    }

    public void saveTree(String fileName) {
        try {
            fileOperations.saveToFile(familyTree, fileName);
            messageView.displayMessage("Family tree saved to " + fileName);
        } catch (IOException e) {
            messageView.displayMessage("Error saving family tree: " + e.getMessage());
        }
    }
}
