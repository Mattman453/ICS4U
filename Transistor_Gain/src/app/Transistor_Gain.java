/* Author: Matt Cruickshank
Class: ICS4U

Program: Intro To Java, Transistor gain
Input: Amperes for base and collector pins
Processing: Determine transistor gain
Output: Transistor gain*/

package app;

import java.util.Scanner;

public class Transistor_Gain {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // Create a scanner object to grab input from the user

        // Creation of local variables
        double collectorCurrent;
        double baseCurrent;
        double gain;

        // Run until collector current is 0
        do {
            System.out.print("Enter the amount of collector current (in Amperes): ");
            collectorCurrent = input.nextDouble();
            System.out.print("Enter the amount of base current (in Amperes): ");
            baseCurrent = input.nextDouble();

            // Avoid dividing by 0
            if (baseCurrent!=0) {
                gain = collectorCurrent/baseCurrent; // Find current gain
            } else {
                gain = 0;
            }

            System.out.println("The transistor current gain is " + gain + ".");
        } while (collectorCurrent!=0);
        input.close();
    }
}