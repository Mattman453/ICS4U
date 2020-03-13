package ics.mattj;

import java.util.Scanner;

public class Main {
    // Grabs integers from the user and outputs the total
    public static void main(String[] args) {
        int number, total = 0; // Create variables for use later to not redeclare every time through the for loop
        Scanner input = new Scanner(System.in); // Create the object to grab items from the terminal
        for (int i=1; i<4; i++) {
            System.out.print("Enter Integer " + i + ": "); // Ask for input from the user
            number = input.nextInt(); // Grab an integer from the terminal
            total+=number; // Add the input integer to the total
        }
        System.out.println("The sum of your numbers is " + total + "."); // Print the total of all input integers
	// write your code here
    }
}
