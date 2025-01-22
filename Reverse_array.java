/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed array is: ");
        for (int k = 0; k < reversed.length; k++) {
            System.out.println(reversed[k]);
        }
    }
}
 


