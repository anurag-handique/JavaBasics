package oops.example;

public class Human extends Living {

    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            throw new IllegalArgumentException("Age can't be negative");
        }
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public void sayName(){
        System.out.println("My name is "+name);

    }
}
