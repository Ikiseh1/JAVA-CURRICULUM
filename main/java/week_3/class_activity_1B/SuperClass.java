package week_3.class_activity_1B;

public class SuperClass {
    private String name;
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Constructor
    public SuperClass(String name, int age){
        this.name = name;
        this.age = age;


    }
    //method
    public void display(){
        System.out.println("Name: " + getName()+ "Age: " + age);
    }
}
