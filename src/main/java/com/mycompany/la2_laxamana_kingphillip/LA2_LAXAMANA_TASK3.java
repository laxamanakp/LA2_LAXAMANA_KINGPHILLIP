/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la2_laxamana_kingphillip;

/**
 *
 * @author admin
 */
public class LA2_LAXAMANA_TASK3 {

    public static void main(String[] args) {
        
    // 3. Create a Java program that stores a sample full name in a variable, shows it in uppercase and lowercase, counts the number of characters, and shows where the letter "a" appears first.
        // Store a sample full name in a variable
        String fullName = "King Phillip Laxamana";

        // Convert to uppercase and lowercase
        String upperCaseName = fullName.toUpperCase();
        String lowerCaseName = fullName.toLowerCase();

        // Count the number of characters
        int charCount = fullName.length();

        // Find the first occurrence of the letter "a"
        int firstIndexOfA = fullName.toLowerCase().indexOf('a');

        // Display results
        System.out.println("\nString Operations:");
        System.out.println("Original Name: " + fullName);
        System.out.println("Uppercase: " + upperCaseName);
        System.out.println("Lowercase: " + lowerCaseName);
        System.out.println("Number of Characters: " + charCount);

        if (firstIndexOfA != -1) {
            System.out.println("First occurrence of 'a' is at index: " + firstIndexOfA);
        } else {
            System.out.println("The letter 'a' does not appear in the name.");
        }
    }
}
