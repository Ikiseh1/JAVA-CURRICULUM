package week_3.class_activity_4A.exercise;

public class Teacher extends Person{
    public Teacher (String name, int age){
        super(name, age);
    }
    @Override
    public void display(){
        System.out.println("Teacher Name is: " +getName() + "Teacher Age is: " + getAge());

    }
}
