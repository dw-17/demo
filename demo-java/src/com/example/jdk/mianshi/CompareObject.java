package com.example.jdk.mianshi;

/*
    对象的比较
 */
public class CompareObject {
    private String name;
    private int age;

    public CompareObject(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean compare(CompareObject compareObject) {
        if (this == compareObject) {
            return true;
        }

        return this.getName().equals(compareObject.getName()) && this.getAge() == compareObject.getAge();
    }

    public static void main(String[] args) {
        CompareObject object1 = new CompareObject("Tom", 18);
        CompareObject object2 = new CompareObject("Tom", 18);
//        CompareObject object2 = new CompareObject("Jack",23);
        if (object1.compare(object2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
