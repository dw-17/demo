package com.example.jdk.mianshi;

/*
    链表(查询/新增/删除)
 */
public class Link02 {
    class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public void add(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.add(newNode);
            }
        }

        public void print() {
            System.out.println(this.data);
            if (this.next != null) {
                this.next.print();
            }
        }

        public boolean search(String data) {
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.search(data);
                } else {
                    return false;
                }
            }
        }

        public void delete(Node previous, String data) {
            if (data.equals(this.data)) {
                previous.next = this.next;
            } else {
                this.next.delete(previous, data);
            }
        }
    }

    private Node root;

    public void addNode(String data) {
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.add(newNode);
        }
    }

    public void printNode() {
        if (this.root != null) {
            this.root.print();
        }
    }

    public boolean contains(String data) {
        return this.root.search(data);
    }

    public void deleteNode(String data) {
        if (this.contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next;
            } else {
                this.root.next.delete(root, data);
            }
        }
    }
}

class LinkTest02 {
    public static void main(String[] args) {
        //新增
        Link02 link02 = new Link02();
        link02.addNode("node_A");
        link02.addNode("node_B");
        link02.addNode("node_C");
        link02.addNode("node_D");
        link02.addNode("node_E");
        link02.addNode("node_F");
        //打印
        link02.printNode();
        //查询
        System.out.println(link02.contains("node_A"));
        //删除
        link02.deleteNode("node_B");
        //打印
        link02.printNode();
    }
}