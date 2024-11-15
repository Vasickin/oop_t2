import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * создание класса Person
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int birthdate;
    private Person mother;
    private Person father;
    private List<Person> children;


    /**
     * конструктор с дмумя параметрами
     * @param name
     * @param birthdate
     */
    public Person(String name, int birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    /**
     * метод добавления детей 
     * @param child
     */
    public void addChild(Person child) {
        this.children.add(child);
    }

    /**
     * Переопределение метода toString для вывода информации о человеке
     * Каждый блок проверяется с помощью тернарного оператора. Пример: (mother !=
     * null ? ", Мать: " + mother.getName() : "")) — это тернарный оператор.
     */
    @Override
    public String toString() {
        return "Имя: " + name + ", Год рождения: " + birthdate +
        (mother != null ? ", Мать: " + mother.getName() : "") +
        (father != null ? ", Отец: " + father.getName() : "");
    }




}
