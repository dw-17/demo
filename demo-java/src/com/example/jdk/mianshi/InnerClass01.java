package com.example.jdk.mianshi;

/*
    内部类
 */
class OutClass01 {
    private String info = "hello world 01";

    class InnerClass01 {
        public void print() {
            System.out.println(info);
        }
    }

    public void fun() {
        new InnerClass01().print();
    }
}

public class InnerClass01 {
    public static void main(String[] args) {
        new OutClass01().fun();
    }
}
