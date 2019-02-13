package ro.mirodone;

public class Employee {

    private String name;
    private int age;

    Employee (String name, int age){
        this.name=name;
        this.age=age;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return name;
    }
}
