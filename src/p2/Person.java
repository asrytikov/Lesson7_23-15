package p2;

public class Person {

    public static final int predel = 10;

    private String name;
    private int age;
    private int id;
    static int counter = 1;

    public Person(){
        id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.printf("Name: %s \tAge: %d Id: %d\n", name, age, id);
    }
}
