import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;
    private final String  NOT_INDICATED = "не указан.";

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = null;
    }
    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
        this.city = city;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
        this.city = null;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }
    public String getCity() {
        if (city == null) return NOT_INDICATED;
        else return city;
    }
    public boolean hasAge() {
        return !(age < 0);
    }
    public void happyBithday() {
        if (hasAge()) age++;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setCity(city);
    }

    @Override
    public String toString() {
        String name = getName();
        String surname = getSurname();
        String ageString;
        String cityString;
        if (hasAge()) ageString = String.valueOf(age);
        else ageString = "Возраст " + NOT_INDICATED;
        if (city == null) cityString = "Город " + NOT_INDICATED;
        else cityString = city;
        return "Person{" +
                "name: " + name +
                ", surname: " + surname +
                ", age: " + ageString +
                ", city: " + cityString +
                '}';
    }
}
