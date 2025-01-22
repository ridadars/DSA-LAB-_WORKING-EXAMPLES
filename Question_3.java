/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author Rida
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        appendRecursive(head, newNode);
    }

    private void appendRecursive(Node current, Node newNode) {
        if (current.next == null) {
            current.next = newNode;
        } else {
            appendRecursive(current.next, newNode);
        }
    }

    public MyLinkedList copy() {
        MyLinkedList copiedList = new MyLinkedList();
        copyRecursive(head, copiedList);
        return copiedList;
    }

    private void copyRecursive(Node current, MyLinkedList copiedList) {
        if (current == null) return;
        copiedList.append(current.data);
        copyRecursive(current.next, copiedList);
    }

    public MyLinkedList reverse() {
        MyLinkedList reversedList = new MyLinkedList();
        reverseRecursive(head, reversedList);
        return reversedList;
    }

    private void reverseRecursive(Node current, MyLinkedList reversedList) {
        if (current == null) return;
        reverseRecursive(current.next, reversedList);
        reversedList.append(current.data);
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Question_3 {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.println("Original List:");
        myList.printList();

        MyLinkedList copiedList = myList.copy();
        System.out.println("Copied List:");
        copiedList.printList();

        MyLinkedList reversedList = myList.reverse();
        System.out.println("Reversed List:");
        reversedList.printList();
    }
}
