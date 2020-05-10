package com.example.jdk.mianshi;

/*
    继承关系
 */
public class JiChengPerson01 {
    private void print() {
        System.out.println("Person");
    }

    public void fun() {
        this.print();
    }
}

class Student01 extends JiChengPerson01 {
    void print() {
        System.out.println("Student");
    }
}

class JiChengTest01 {
    public static void main(String[] args) {
        Student01 student = new Student01();
        student.fun();
    }
}
