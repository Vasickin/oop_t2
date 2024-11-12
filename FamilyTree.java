




import java.util.ArrayList;
import java.util.List;

/**
 * создание класса amilyTree
 */
public class FamilyTree {

    private List<Person> people;
                
                    public FamilyTree(){
                        people = new ArrayList<>();
                }
            
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
