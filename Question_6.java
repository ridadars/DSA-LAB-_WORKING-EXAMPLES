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

    public void appendNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        appendNodeIterative(head, newNode);
    }

    private void appendNodeIterative(Node current, Node newNode) {
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteList() {
        head = null; 
        System.out.println("The linked list has been deleted.");
    }
}

public class Question_6 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.appendNode(1);
        list.appendNode(2);
        list.appendNode(3);

        System.out.println("Original List:");
        list.printList();

        // Deleting the linked list
        list.deleteList();

        System.out.println("After deletion:");
        list.printList(); // Should print "null"
    }
}
