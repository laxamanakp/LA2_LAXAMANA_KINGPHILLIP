/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la2_laxamana_kingphillip1;

/**
 *
 * @author admin
 */

public class LA2_LAXAMANA_TASK4 {

    public static void main(String[] args) {
         
    // 4. Write a Java program that uses two pre-defined numbers to find the maximum and minimum values, calculates a square root, and rounds a decimal value.
        // Pre-defined numbers
        double preNum1 = 25.4;
        double preNum2 = 15.8;

        // Find maximum and minimum values
        double max = Math.max(preNum1, preNum2);
        double min = Math.min(preNum1, preNum2);

        // Calculate square root of preNum1
        double sqrt = Math.sqrt(preNum1);

        // Round preNum2 to the nearest integer
        long rounded = Math.round(preNum2);

        // Display results
        System.out.println("\nMath Operations:");
        System.out.println("Number 1: " + preNum1);
        System.out.println("Number 2: " + preNum2);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        System.out.println("Square Root of " + preNum1 + ": " + sqrt);
        System.out.println("Rounded Value of " + preNum2 + ": " + rounded);
    }
}
