/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class Second_max {
    public static void main(String[] args) {
       int arr[] = {9,3,13,1,2};
       
     int secmax=0;
       int max=arr[0];
       for(int i=1;i<arr.length;i++) {
           if(max < arr[i]) {
               secmax=max;
               max=arr[i];
       }
           else if(max>arr[i] && secmax<arr[i]) {
               secmax=arr[i];
               max=max;
           }    
           
       }
       System.out.println("Second maximum value is:"+secmax);
       } 
}




