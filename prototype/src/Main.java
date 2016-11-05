import prototype_factory.PrototypeFactory;
import prototype_factory.PrototypeFactoryImpl;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory personsFactory = new PrototypeFactoryImpl();
        Person person = new Person(12, "Adam");

        Person personsCopy = personsFactory.makePrototype(person);
        personsCopy.age = 22;

        System.out.println(person);
        System.out.println(personsCopy);
    }
}
