package week_3.class_activity_4A.exercise;

public abstract class Person {
    private String name;
    private int age;

    //CONSTRUCTOR
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    //GETTERS
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void display(){

    }
}
