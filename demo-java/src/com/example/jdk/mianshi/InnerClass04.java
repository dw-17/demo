package com.example.jdk.mianshi;

/*
    方法中定义内部类
 */
class OutClass04 {
    private String info = "hello world 04";

    public void fun(final int temp) {
        class InnerClass04 {
            public void print() {
                System.out.println("类中的私有属性--->" + info);
                System.out.println("方法中的参数--->" + temp);
            }
        }
        new InnerClass04().print();
    }
}

public class InnerClass04 {
    public static void main(String[] args) {
        new OutClass04().fun(30);
    }
}
