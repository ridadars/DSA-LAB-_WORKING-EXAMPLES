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

    public MyLinkedList merge(MyLinkedList otherList) {
        MyLinkedList mergedList = new MyLinkedList();
        mergedList.head = mergeSortedLists(this.head, otherList.head);
        return mergedList;
    }

    private Node mergeSortedLists(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node mergedHead;
        if (list1.data < list2.data) {
            mergedHead = list1;
            mergedHead.next = mergeSortedLists(list1.next, list2);
        } else {
            mergedHead = list2;
            mergedHead.next = mergeSortedLists(list1, list2.next);
        }
        return mergedHead;
    }
}

public class Question_5 {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.appendNode(1);
        list1.appendNode(3);
        list1.appendNode(5);
        
        MyLinkedList list2 = new MyLinkedList();
        list2.appendNode(2);
        list2.appendNode(4);
        list2.appendNode(6);

        System.out.println("List 1:");
        list1.printList();
        
        System.out.println("List 2:");
        list2.printList();

        MyLinkedList mergedList = list1.merge(list2);
        System.out.println("Merged List:");
        mergedList.printList();
    }
}
