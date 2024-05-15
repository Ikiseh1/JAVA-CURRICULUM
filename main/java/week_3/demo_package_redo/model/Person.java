package week_3.demo_package_redo.model;

import week_3.demo_package_redo.enums.Gender;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    //Consttructor
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
}