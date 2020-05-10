package com.example.jdk.mianshi;

/*
    模板设计模式
 */
abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void say() {
        System.out.println(getContent());
    }

    public abstract String getContent();
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getContent() {
        return "Name--->" + getName() + ";Age--->" + getAge();
    }
}

public class DesignTemplate {
    public static void main(String[] args) {
        Person ps = new Student("Tom", 20);
        ps.say();
    }
}
