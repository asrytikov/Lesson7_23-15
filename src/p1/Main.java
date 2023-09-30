package p1;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.printInfo();
        ivan.name = "Ivan";
        ivan.age = 30;
        ivan.printInfo();

        Person person = new Person("Marya");
        person.printInfo();

        Person person1 = new Person("Sergey", 21);
        person1.printInfo();
        person1.printAddress();
    }
}
