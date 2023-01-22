public class Main {
    public static void main(String[] args) {
        System.out.println("\t Домашнее задание по теме: \"Порождающие шаблоны. Builder, Singleton, ...\"");
        PersonBuilder personBuilder = new PersonBuilder();
        Person farther = personBuilder
                .setName("Ленар")
                .setSurname("Хафизов")
                .setAge(51)
                .setCity("Казань")
                .build();
        farther.happyBithday();
        Person son = farther.newChildBuilder().setName("Камиль").build();
        System.out.println(farther);
        System.out.println("Сын: " + son);
    }
}
