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
public class Comparing_Two_Floating_Point_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (areEqualUptoThreeDecimalPlaces(num1, num2)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
    }

    public static boolean areEqualUptoThreeDecimalPlaces(double num1, double num2) {
        return (int)(num1 * 1000) == (int)(num2 * 1000);
    }
}

