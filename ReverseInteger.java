/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dsaa;

/**
 *
 * @author Rida
 */
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Variable to store the reversed number
        int reversed = 0;

        // Reverse the integer
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Add the digit to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversed);
        
        // Close the scanner
        scanner.close();
    }
}

