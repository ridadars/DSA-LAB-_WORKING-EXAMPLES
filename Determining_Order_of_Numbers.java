/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
import java.util.Scanner;
public class Determining_Order_of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter Second Number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter Third Number: ");
        int num3 = scanner.nextInt();
        
        System.out.println(DeterminingOrder(num1, num2, num3));
    }
    public static String DeterminingOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3){
            return "The numbers are in Increasing Order";
        }
        else if (num1 > num2 && num2 > num3){
            return "The numbers are in Decreasing Order"; }
            else {
            return "The numbers are neither in Increasing Order nor in Decreasing Order"; }
                    }    
        }

