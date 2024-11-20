package dsa_lab;

public class Stack_through_LinkedList {
    private Node top;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    public Node deleteFirst() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot perform pop operation.");
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    public void displayList() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.println("Stack elements (from top to bottom):");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class LinkedListStack {
    private Stack_through_LinkedList linkedList = new Stack_through_LinkedList();

    public void push(int element) {
        linkedList.insertFirst(element);
    }

    public void pop() {
        linkedList.deleteFirst();
    }

    public void displayStack() {
        linkedList.displayList();
    }
}

class LLStackClient {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(50);
        stack.push(70);
        stack.push(190);

        System.out.println("1. Stack after push operations:");
        stack.displayStack();

        System.out.println("\n2. Stack after pop operation:");
        stack.pop();
        stack.displayStack();
    }
}
