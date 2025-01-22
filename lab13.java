/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rida
 */
import java.io.*; 
import java.util.*; 

public class lab13 {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {67, 44, 82, 17, 20};
        System.out.print("Array before Sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            int swaps = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps = 1;
                }
            }
            if (swaps == 0)
                break;
        }
        System.out.print("Array After Sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
