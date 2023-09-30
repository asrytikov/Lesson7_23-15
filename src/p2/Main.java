package p2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");
        person.setAge(19);

        person.info();

        Person.counter = 8;

        Person person1 = new Person();
        person1.info();

        System.out.println(Person.predel);


    }

}
