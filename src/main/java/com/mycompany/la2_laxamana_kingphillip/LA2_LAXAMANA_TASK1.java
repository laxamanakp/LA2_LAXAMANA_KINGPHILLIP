/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la2_laxamana_kingphillip1;

/**
 *
 * @author admin
 */

public class LA2_LAXAMANA_TASK1{

    public static void main(String[] args) {
        
        
     // 1. Create a Java program that shows both widening casting and narrowing casting with comments to explain each step. 
       
        // Widening Casting (automatically) - converting a smaller type to a larger type
        int myInt = 10;
        double myDouble = myInt; // Automatically converts int to double
        System.out.println("Widening Casting:");
        System.out.println("int value: " + myInt);
        System.out.println("double value: " + myDouble);

        // Narrowing Casting (manually) - converting a larger type to a smaller type
        double anotherDouble = 20.5;
        int anotherInt = (int) anotherDouble; // Manually converts double to int
        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + anotherDouble);
        System.out.println("int value: " + anotherInt);

    }
}
