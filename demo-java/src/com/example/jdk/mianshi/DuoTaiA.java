package com.example.jdk.mianshi;

public class DuoTaiA {
    public void fun1() {
        System.out.println("A---fun1");
    }

    public void fun2() {
        this.fun1();
    }
}

class B extends DuoTaiA {
    public void fun1() {
        System.out.println("B----fun1");
    }

    public void fun3() {
        System.out.println("B--->fun3");
    }
}

class DuoTaiTest {
    public static void main(String[] args) {
        B b = new B();
        b.fun1();
        b.fun2();
        b.fun3();
        System.out.println("=========================");
        DuoTaiA a = b;
        a.fun1();
        a.fun2();
        System.out.println("=========================");
        B b2 = (B) a;
        b2.fun1();
        b2.fun2();
        b2.fun3();
        System.out.println("=========================");
        System.out.println("b--->A-->" + (b instanceof DuoTaiA));
        System.out.println("b--->B-->" + (b instanceof B));
        System.out.println("a--->A-->" + (a instanceof DuoTaiA));
        System.out.println("a--->B-->" + (a instanceof B));
        System.out.println("b2--->A-->" + (b instanceof DuoTaiA));
        System.out.println("b2--->B-->" + (b instanceof B));
        System.out.println("a--->A-->" + ((new DuoTaiA()) instanceof DuoTaiA));
        System.out.println("a--->B-->" + ((B) (new DuoTaiA()) instanceof B));
    }
}