/* Author: Matt Cruickshank
Class: ICS4U

Program: Intro To Java, Smile with Similes
Input: Number of adjectives, number of nouns, adjectives and nouns
Processing: None
Output: Print all combinations of adjectives and nouns*/
package ics;

import mattj.Input;

public class Similes {

    public static void main(String[] args) {
        int n = (int)Input.getNumber(); // Grab number of adjectives
        int m = (int)Input.getNumber(); // Grab number of nouns
        String[] adjectives = new String[n]; // Create arrays for later use
        String[] nouns = new String[m];
        for (int i=0; i<n; i++) { // Add adjectives to the array
            adjectives[i] = Input.getWord();
        }
        for (int i=0; i<m; i++) { // Add nouns to the array
            nouns[i] = Input.getWord();
        }
        for (int i=0; i<n; i++) { // Print combinations
            for (int j=0; j<m; j++) {
                System.out.println(adjectives[i] + " as " + nouns[j]);
            }
        }
    }
}
