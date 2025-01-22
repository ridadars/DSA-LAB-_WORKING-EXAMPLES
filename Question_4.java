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
        appendNodeRecursive(head, newNode);
    }

    private void appendNodeRecursive(Node current, Node newNode) {
        if (current.next == null) {
            current.next = newNode;
        } else {
            appendNodeRecursive(current.next, newNode);
        }
    }

    public void removeDuplicatesFromSorted() {
        removeDuplicatesFromSortedRecursive(head);
    }

    private void removeDuplicatesFromSortedRecursive(Node current) {
        if (current == null || current.next == null) {
            return;
        }
        if (current.data == current.next.data) {
            current.next = current.next.next;
            removeDuplicatesFromSortedRecursive(current); // Check the same node again
        } else {
            removeDuplicatesFromSortedRecursive(current.next); // Move to the next node
        }
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

public class Question_4 {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.appendNode(1);
        myList.appendNode(1);
        myList.appendNode(2);
        myList.appendNode(3);
        myList.appendNode(3);
        myList.appendNode(4);
        myList.appendNode(5);
        myList.appendNode(5);

        System.out.println("Original List:");
        myList.printList();

        myList.removeDuplicatesFromSorted();

        System.out.println("List after removing duplicates:");
        myList.printList();
    }
}
