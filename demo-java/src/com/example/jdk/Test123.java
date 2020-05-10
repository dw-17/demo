package com.example.jdk;

public class Test123 {

    public static void main(String[] args) {
        Object obj = new Test123();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    System.out.println(Thread.currentThread().getName() + "---" + i);
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "th1");

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    System.out.println(Thread.currentThread().getName() + "---" + i);
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "th3");

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            }
        }, "th2");

        th1.start();
        th2.start();
        th3.start();
    }
}