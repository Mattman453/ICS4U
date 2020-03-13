/* Author: Matt Cruickshank
Class: ICS4U

Program: Intro To Java, Now I Know My ABC's
Input: Sentences;
Processing: Find the amount of each letter;
Output: Print umber of each letter*/
package ics;

import mattj.Input;

public class ABCs {

    public static void main(String[] args) {
        while (true) {
            String sentence = Input.getLine().toUpperCase(); // Grab sentence
            if (sentence.equals("STOP")) // If stop is entered, break the loop
                break;
            int length = sentence.length(); // Get the length of the string
            int[] numOfLetter = new int[26]; // Create an array for storage of each letter
            char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // Array for simplified comparisons
            for (int i = 0; i < 26; i++) { // Set entire array to 0
                numOfLetter[i] = 0;
            }
            for (int i = 0; i < length; i++) { // Deconstruct the sentence one char at a time
                char letter = sentence.charAt(i);
                for (int j = 0; j < 26; j++) { // Compare to available letters
                    if (letter == letters[j]) {
                        numOfLetter[j]++;
                    }
                }
            }
            for (int i = 0; i < 26; i++) { // Print proper letters and numbers
                if (numOfLetter[i] > 0) {
                    System.out.print(letters[i] + "-" + numOfLetter[i] + ":");
                }
            }
        }
    }
}
