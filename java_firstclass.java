/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_dsaa;

/**
 *
 * @author Rida
 */

import java.util.Scanner;

public class java_firstclass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Initialize sum variable
        int sum = 0;

        // Calculate sum of first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
