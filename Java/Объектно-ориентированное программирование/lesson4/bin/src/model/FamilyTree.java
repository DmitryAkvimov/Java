package model;
import java.io.Serializable;
import java.util.*;

public class FamilyTree<T> implements Serializable, Iterable<T> {
    private static final long serialVersionUID = 1L;
    private List<T> members;

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addMember(T member) {
        members.add(member);
    }

    public List<T> getMembers() {
        return members;
    }

    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }

    // Сортировка по имени
    public void sortByName() {
        members.sort(Comparator.comparing(Object::toString));
    }

    // Сортировка по году рождения
    public void sortByBirthYear() {
        if (members.get(0) instanceof Person) {
            members.sort((p1, p2) -> Integer.compare(
                ((Person) p1).getBirthYear(), 
                ((Person) p2).getBirthYear()
            ));
        }
    }
}
