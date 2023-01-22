public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname (String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge (int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Вы указали некорректный возраст.");
        }
        age = age;
        return this;
    }
    public PersonBuilder setCity (String city) {
        this.city = city;
        return this;
    }
    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Вы забыли указать имя.");
        }
        if (surname == null) {
            throw new IllegalStateException("Вы забыли указать фамилию.");
        }
        if (age == 0) age = -1;
        return new Person(name, surname, age, city);
    }
}
