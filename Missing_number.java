/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class Missing_number {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};
        int size=7;
        int expectedsum=(size*(size+1))/2;
        int actualsum=0;
        
        for(int i=0;i<arr.length;i++) {
            actualsum += arr[i];
        }
        int missingnumber=expectedsum-actualsum;
        System.out.println("Missing value in an array is:"+missingnumber);
    }
}

