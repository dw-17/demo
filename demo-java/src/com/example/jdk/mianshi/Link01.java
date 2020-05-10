package com.example.jdk.mianshi;

/*
    链表的实现
 */
class Node01 {
    private String data;
    private Node01 next;

    public Node01(String date) {
        this.data = date;
    }

    public Node01 getNext() {
        return this.next;
    }

    public void setNext(Node01 next) {
        this.next = next;
    }

    public String getData() {
        return this.data;
    }
}

public class Link01 {
    public static void main(String[] args) {
        Node01 root = new Node01("root");
        Node01 Node01_A = new Node01("Node01_A");
        Node01 Node01_B = new Node01("Node01_B");
        Node01 Node01_C = new Node01("Node01_C");
        root.setNext(Node01_A);
        Node01_A.setNext(Node01_B);
        Node01_B.setNext(Node01_C);
        printNode01(root);
    }

    public static void printNode01(Node01 Node01) {
        System.out.println("当前节点数据--->" + Node01.getData());
        if (Node01.getNext() != null) {
            printNode01(Node01.getNext());
        }
    }
}
