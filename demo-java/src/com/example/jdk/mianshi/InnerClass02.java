package com.example.jdk.mianshi;

/*
    静态内部类
 */
class OutClass02 {
    private static String info = "hello world 02";

    static class InnerClass02 {
        public void print() {
            System.out.println(info);
        }
    }

    public void fun() {
        new InnerClass02().print();
    }
}

public class InnerClass02 {
    public static void main(String[] args) {
        new OutClass02.InnerClass02().print();
//        new OutClass02().fun();
    }
}
