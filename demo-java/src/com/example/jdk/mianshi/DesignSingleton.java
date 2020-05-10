package com.example.jdk.mianshi;

/*
    单例模式
 */
public class DesignSingleton {
    private static DesignSingleton singleton = new DesignSingleton();

    public static DesignSingleton getInstance() {
        return singleton;
    }

    private DesignSingleton() {
        System.out.println("构造方法");
    }

    public void print() {
        System.out.println("this is print");
    }
}

class SingletonGet {
    public static void main(String[] args) {
        DesignSingleton.getInstance().print();
        DesignSingleton.getInstance().print();
        DesignSingleton.getInstance().print();
    }
}
