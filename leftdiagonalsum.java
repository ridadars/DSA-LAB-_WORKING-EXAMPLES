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
public class leftdiagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int colls = sc.nextInt();
        
        int[][] matrix = new int[rows][colls];
        System.out.println("Enter the array Elements: ");
        //input
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colls; j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("MATRIX:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colls; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
            }
        int sumL = 0;
//sumR=0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colls; j++){
                if(i==j)
                    sumL += matrix[i][j];
//                if(i+j==rows-1)
//                    sumR+=matrix[i][j];
            }}
//        System.out.println("SUM OF DIAGONALS");
        System.out.println("Sum of Left Diagonal = " + sumL);
//        System.out.println("Sum of Left Diagonal: + SumL ");
    }
    }


