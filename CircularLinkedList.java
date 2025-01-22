/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_labb;

/**
 *
 * @author Rida
 */
class LinkedList{
    int size = 0;
    Node head , tail ;
    
    class Node{
        int data ;
        Node next ;
    
    
        public Node(int Data){
            data =  Data;
        }
    }
    
    public boolean isEmpty(){
        if(head == null && tail == null){
            System.out.println("Linkelist is empty ");
            return true;
        }
        return false;
    }
    
    public void insertAtLast(int element){
        Node new_node  = new Node(element);
        if(isEmpty()){
            head = tail = new_node;
            return ;
        }
        else{
            tail.next = new_node;
            tail = new_node;
            tail.next = head;
            size++;
        }
    }
    
    public void insertAtFirst(int element){
        Node new_node = new Node(element);
        if(isEmpty()){
            head = tail = new_node;
            return ;
        }       
        new_node.next = head;
        head = new_node ;
        tail.next = head ;
        size++;
    }
    
    public void deleteHead(){
        if(isEmpty()){
            return;
        }
        head = head.next;
        tail.next = head;
        size--;
    }
    
    public void deleteEnd(){
        Node current= head ;
        while (current != null){
            if(current.next.next == head){
                current.next = head ;
                tail = current;
                size--;
                return;
            }
            current = current.next;
        }
    }
    
    public void deletAtPosition(int pos){
        if(isEmpty()){
            return;
        }
      
        if(pos == 1){
            deleteHead();
            return;
        }
        else if(pos == size){
            deleteEnd();
            return;
        }
        
        int index = 1;
        Node current  = head ;
        while(current != null){
            index++ ;
            if(index == pos){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        
    }
    
    public void printList(){
        if(isEmpty()){
            return;
        }
        Node current = head ;
        do{
            System.out.print(current.data +" ");
            current = current.next;
        }
        while(current != head);
        System.out.println("");
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        LinkedList list  = new LinkedList();
        
        list.insertAtLast(0);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        
//        list.insertAtFirst(8);
//        list.insertAtFirst(8);
//        
//        list.deleteHead();
//        list.deleteHead();
//        
//        list.deleteEnd();
            
        list.deletAtPosition(2);
        list.printList();
    }
}
