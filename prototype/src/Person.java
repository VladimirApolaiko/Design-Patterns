import prototype_factory.Copyable;

/**
 * Created by vladimir on 11/5/16.
 */
public class Person implements Copyable<Person>{

    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Person copy() {
        return new Person(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
