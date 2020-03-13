package ics.mattj;

import java.util.Scanner;

public class Main {
    // Grabs marks from user and averages them
    public static void main(String[] args) {
        double number, total = 0; // Create variables for use later to not redeclare every time through the for loop
        Scanner input = new Scanner(System.in); // Create the object to grab items from the terminal
        for (int i=1; i<5; i++) {
            System.out.print("Enter Mark " + i + ": "); // Ask for input from the user
            number = input.nextDouble(); // Grab a double from the terminal
            while (number>100.0 || number<0.0) {
                System.out.print("That doesn't make sense. Try again: ");
                number = input.nextDouble();
            }
            total+=number; // Add the input double to the total
        }
        System.out.println("The average mark is " + total/4 + "."); // Print the average mark
        // write your code here
    }
}