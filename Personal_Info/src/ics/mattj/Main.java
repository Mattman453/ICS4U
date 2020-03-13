/*Author: Matthew Cruickshank
Class: ICS4U

Program: Variables And Display.Greet a user and tell them their year of birth
Input: Doubles for age and current year. Strings for name and has birthday passed
Processing: Calculate birth year from age, current year and birthday passed
Output: Greeting and birth year
 */
package ics.mattj;

import java.util.Scanner;

public class Main {
    // get information from the user and greet them
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create the object to grab items from the terminal
        System.out.print("What is your name: "); // Print to the terminal
        String name = Utility.getString(); // Grab a string from the terminal
        System.out.print("How old are you: "); // Print to the terminal
        double age = Utility.getNumber(); // Grab a double from the terminal
        System.out.print("What year is it: "); // Print to the terminal
        double year = Utility.getNumber(); // Grab a double from the terminal
        System.out.print("Has your birthday passed(Y/N): "); // Print to the terminal
        String answer = Utility.getString(); // Grab a string from the terminal
        double birthYear = year - age; // Find potential birth year
        if (answer.contains("N")) {
            birthYear--; // Slight correction
        }
        System.out.println("Hello, " + name + ". I believe you were born in " + birthYear + "."); // Print to the terminal
        // write your code here
    }
}