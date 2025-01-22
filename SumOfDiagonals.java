/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class SumOfDiagonals {
    int matrix[][] = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
    int Sum1 = 0;
    int Sum2 = 0;

    // Constructor
    SumOfDiagonals() {
        SumOfLeftDiagonal();
        SumOfRightDiagonal();
    }

    void SumOfLeftDiagonal() {
        for (int i = 0; i < 3; i++) {
            Sum1 += matrix[i][i]; 
        }
        System.out.println("SUM OF LEFT DIAGONAL: " + Sum1);
    }

    void SumOfRightDiagonal() {
        int i;
        int j;
         for(i=0;i<=2;i++) {
             for(j=2;j>=0;j--) {
                 
             if(j==2-i){
            Sum2 += matrix[i][j];
            
        }
             i++;
         }
         }
         System.out.println("SUM OF RIGHT DIAGONAL:"+Sum2);
    }

    public static void main(String[] args) {
        SumOfDiagonals obj = new SumOfDiagonals();
    }
}

