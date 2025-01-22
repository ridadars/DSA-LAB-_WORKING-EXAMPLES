/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class Resize_an_array {
    public static void main(String[] args) {
        int[] originalarr = {13, 2, 34, 4, 59}; 
        int newsize = 8;
        int[] resizearr = new int[newsize]; 

       
        for (int i = 0; i < originalarr.length; i++) {
            resizearr[i] = originalarr[i]; 
        }

        
        System.out.println("Resized Array:");
        for (int i = 0; i < resizearr.length; i++) {
            System.out.print(resizearr[i]+" "); 
        }
    }
}



