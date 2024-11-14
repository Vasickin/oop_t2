import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * конструктор
         */
        Person Olga = new Person("Ольга", 1965);
        Person Anrej = new Person("Андрей", 1965);
        Person Marina = new Person("Марина", 1984);
        Person Alex = new Person("Алексей", 1982);
        Person Sofija = new Person("Софья", 1910);
        Person Egor = new Person("Егор", 1912);

        Marina.setFather(Anrej);
        Alex.setFather(Anrej);
        Anrej.setFather(Egor);
        Olga.setFather(Egor);

        Marina.setMother(Olga);
        Alex.setMother(Olga);
        Olga.setMother(Sofija);
        Anrej.setMother(Sofija);


        /**
         * добавления детей
         */
        Anrej.addChild(Marina);
        Anrej.addChild(Alex);
        Olga.addChild(Marina);
        Olga.addChild(Alex);

        FamilyTree familyTree = new FamilyTree();

        /**
         * добарления родственника к фамильному дереву
         */
        familyTree.addPerson(Alex);
        familyTree.addPerson(Olga);
        familyTree.addPerson(Marina);
        familyTree.addPerson(Anrej);

        System.out.println();
        System.out.println(Marina);
        System.out.println(Olga);
        System.out.println(Alex);
        System.out.println(Anrej);

        System.out.println();

        List<Person> AnrejChildren = familyTree.getChildren(Anrej);
        for (Person child : AnrejChildren) {
            System.out.println(" Дети Андрея: " + child.getName());
        }

        System.out.println();
        System.out.println();

        List<Person> OlgaChildren = familyTree.getChildren(Olga);
        for (Person child : OlgaChildren) {
            System.out.println(" Дети Ольги: " + child.getName());
        }

        System.out.println();
    }
}
