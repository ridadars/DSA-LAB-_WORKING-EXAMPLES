/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class minimum_value {
    public static void main(String[] args) {
        int arr[]={2,9,4,1};
        int min=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) {
                min=arr[i];
            } 
        }
        
        System.out.println("The Minimum value in array is:"+min);
    }
}

