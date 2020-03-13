package ics.mattj;

import java.util.Scanner;

public class Main {
    // Grab doubles from the user and average them
    public static void main(String[] args) {
        double number, total = 0; // Create variables for use later to not redeclare every time through the for loop
        Scanner input = new Scanner(System.in); // Create the object to grab items from the terminal
        for (int i=1; i<4; i++) {
            System.out.print("Enter Double " + i + ": "); // Ask for input from the user
            number = input.nextDouble(); // Grab a double from the terminal
            total+=number; // Add the input double to the total
        }
        System.out.println("The average of your numbers is " + total/3 + "."); // Print the total of all input doubles
        // write your code here
    }
}