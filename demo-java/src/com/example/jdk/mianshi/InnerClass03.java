package com.example.jdk.mianshi;

/*
    外部访问内部类
 */
class OutClass03 {
    private String info = "hello world 03";

    class InnerClass03 {
        public void print() {
            System.out.println(info);
        }
    }

    public void fun() {
        new InnerClass03().print();
    }
}

public class InnerClass03 {
    public static void main(String[] args) {
        OutClass03 outClass03 = new OutClass03();
        OutClass03.InnerClass03 innerClass03 = new OutClass03().new InnerClass03();
        innerClass03.print();
    }
}
