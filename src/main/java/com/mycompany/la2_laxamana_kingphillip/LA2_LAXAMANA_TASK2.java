/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la2_laxamana_kingphillip1;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class LA2_LAXAMANA_TASK2 {

    public static void main(String[] args) {
        
        
    // 2. Write a Java program that asks the user to enter two numbers, performs arithmetic operations, and checks conditions using comparison and logical operators.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Display results
        System.out.println("\nArithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Check conditions using comparison and logical operators
        if (num1 > num2) {
            System.out.println("\n" + num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println("\n" + num1 + " is less than " + num2);
        } else {
            System.out.println("\nBoth numbers are equal.");
        }

        // Check if both numbers are positive using logical AND
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("At least one number is not positive.");
        }
    }
}
