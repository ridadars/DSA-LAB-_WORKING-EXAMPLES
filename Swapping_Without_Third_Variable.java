/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class Swapping_Without_Third_Variable {
    private int x;
    private int y;
    
    public Swapping_Without_Third_Variable(int x, int y){
        this.x =  x;
        this.y = y;
    }
    
    public void swapping(){
        x = x + y;
        y = x - y;
        x = x - y;      
    }
    
    public void display(){
        System.out.println("x = " + x + ", y = " + y);
    }
    
    public static void main(String[] args) {
        Swapping_Without_Third_Variable obj = new Swapping_Without_Third_Variable(8, 9);
        System.out.println("Before Swapping:");
        obj.display();
        obj.swapping();
        
        System.out.println("After Swzpping:");
        obj.display();
    }
}
