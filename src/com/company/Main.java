package com.company;

class LinkedList {

    public class Node {

        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    public void addNode(int d) {
        Node n = new Node(d);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }


    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of linked list");
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(11);
        list.addNode(1);
        list.addNode(4);
        list.addNode(45);
        list.addNode(3);
        list.addNode(30);
        list.addNode(9);
        list.addNode(2);

        list.display();


    }


    }




