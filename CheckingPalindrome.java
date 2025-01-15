/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab;

/**
 *
 * @author Rida
 */
public class CheckingPalindrome {
    public static boolean palindrome(String str){
        str = str.toLowerCase().replace("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
       String str = "Racecar";
        System.out.println("Is palindrome? "+ palindrome(str));
    }
}

