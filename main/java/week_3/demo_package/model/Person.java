package week_3.demo_package.model;

import week_3.demo_package.enums.Gender;

abstract public class Person {
    private String name;
    private int age;
    private Gender gender;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public Gender getgender(){
        return gender;
    }

    //CONSTRUCTOR

    public Person (String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
