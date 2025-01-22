/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

class SinglyLinkedList {
    Node head; 
    public SinglyLinkedList() {
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
    public int getLength() {
        int count = 0;
        Node currentNode = head; 
        while (currentNode != null) { 
            count++; 
            currentNode = currentNode.next; 
        }
        return count;
    }
}
public class Question_1 {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(1);
        sll.append(2);
        sll.append(3);

        System.out.println("Length of the singly linked list: " + sll.getLength()); 
    }
}
