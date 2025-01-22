/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_labb;

/**
 *
 * @author Rida
 */

import java.util.Scanner;

class Node {
    char data;
    Node prev;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class TextEditor {
    private Node head;
    private Node tail;
    private Node cursor;

    public TextEditor() {
        head = null;
        tail = null;
        cursor = null;
    }

    public void insert(char c) {
        Node newNode = new Node(c);
        if (head == null) {
            head = newNode;
            tail = newNode;
            cursor = head;
        } else {
            if (cursor == null) {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else {
                newNode.prev = cursor.prev;
                newNode.next = cursor;
                if (cursor.prev != null) {
                    cursor.prev.next = newNode;
                } else {
                    head = newNode;
                }
                cursor.prev = newNode;
            }
            cursor = newNode;
        }
    }

    public void delete() {
        if (cursor == null) return;

        if (cursor.prev != null) {
            cursor.prev.next = cursor.next;
        } else {
            head = cursor.next;
        }

        if (cursor.next != null) {
            cursor.next.prev = cursor.prev;
        } else {
            tail = cursor.prev;
        }
        cursor = cursor.prev;
    }

    public void modify(char c) {
        if (cursor != null) {
            cursor.data = c;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Available Commands: [I]nsert <char>, [D]elete, [M]odify <char>, [D]isplay, [E]xit");
            input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts[0].equalsIgnoreCase("insert") && parts.length == 2) {
                editor.insert(parts[1].charAt(0));
            } else if (parts[0].equalsIgnoreCase("delete")) {
                editor.delete();
            } else if (parts[0].equalsIgnoreCase("modify") && parts.length == 2) {
                editor.modify(parts[1].charAt(0));
            } else if (parts[0].equalsIgnoreCase("display")) {
                editor.display();
            } else if (parts[0].equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}

