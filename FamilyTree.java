import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * создание класса FamilyTree
 */
public class FamilyTree implements Serializable {

    private List<Person> people;

    public FamilyTree() {
        people = new ArrayList<>();
    }

    /**
     * метод добавления родственника в семейное дерево с одним
     * 
     * @param person
     */
    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getChildren(Person perent) {
        return perent.getChildren();
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
