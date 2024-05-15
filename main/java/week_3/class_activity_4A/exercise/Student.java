package week_3.class_activity_4A.exercise;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    @Override
    public void display(){
        System.out.println("Student Name is: " +getName() + "Student Age is: " + getAge());
    }
}
