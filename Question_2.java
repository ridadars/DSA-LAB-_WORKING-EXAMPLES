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
        Node lastNode = head;
        while (lastNode.next != null) { 
            lastNode = lastNode.next;
        }
        lastNode.next = newNode; 
    }
    public void printMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slowPtr = head; 
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        System.out.println("The middle node is: " + slowPtr.data);
    }
}
public class Question_2 {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        myList.printMiddle();
    }
}
