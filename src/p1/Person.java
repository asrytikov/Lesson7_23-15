package p1;

public class Person {

    String name;
    protected int age;
    public String address;
    private String phone;

    {
        System.out.println("Start init object");
    }

    public Person() {
        this("None", 18);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    void printInfo(){
        System.out.printf("Name: %s \tAge: %d \n", name, age);
    }

    public void printAge(){
        System.out.printf("Name: %s \tAge: %d \n", name, age);
    }

    void printAddress(){
        System.out.printf("Name: %s \tAddress: %s \n", name, address);
    }

    protected void printPhone(){
        System.out.printf("Name: %s \tPhone: %s \n", name, phone);
    }


}
