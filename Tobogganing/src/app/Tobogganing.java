/* Author: Matt Cruickshank
Class: ICS4U

Program: Intro To Java, Nicholas Loves Tobogganing
Input: Height of hill, maximum climb potential, distance fallen each round, percentage of climb potential;
Processing: Find amount of rounds until success or failure;
Output: Successful attempt or failure*/
package app;

import mattj.Input;

public class Tobogganing {

    public static void main(String[] args) {
        for (int i = 0; i<3; i++) { // Run three times
            double totalDistance = Input.getNumber(); // Grab doubles and prepare for calculations
            double initClimbPotential = Input.getNumber();
            double fallDistance = Input.getNumber();
            double fatigueFactor = Input.getNumber()/100.0;
            double currentDistance = 0;
            int round = 1; // Definition of round number
            do {
                double increaseDistance = initClimbPotential - initClimbPotential*(fatigueFactor*(round-1));
                if (increaseDistance<0) {
                    increaseDistance = 0;
                }
                currentDistance+=increaseDistance; // find distance before falling
                if (currentDistance>totalDistance)
                    break;
                currentDistance-=fallDistance; // find distance after falling
                if (currentDistance<0)
                    break;
                round++; // Go to next round
            } while (true);

            // Print failure or success
            if (currentDistance>totalDistance) {
                System.out.printf("SUCCESS ON ATTEMPT %d\n", round);
            } else {
                System.out.printf("FAILURE ON ATTEMPT %d\n", round);
            }
        }
    }
}
