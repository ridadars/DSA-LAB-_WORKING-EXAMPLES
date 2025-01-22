/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class Zeros_at_end {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 4, 0, 2};
        moveZerosToEnd(arr);
        
        // Print the modified array
        System.out.print("Array after moving zeroes: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int temp;
        int lastNonZeroFoundAt = 0; 

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                
                if (lastNonZeroFoundAt != i) { 
                    temp = arr[lastNonZeroFoundAt];
                    arr[lastNonZeroFoundAt] = arr[i];
                    arr[i] = temp;
                }
                lastNonZeroFoundAt++; 
            }
        }
    }
}
