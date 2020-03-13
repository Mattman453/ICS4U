/* Author: Matt Cruickshank
Class: ICS4U

Project: Challenge Day, Rover
Input: Strings and numbers representing commands and co-ordinates
Processing: Move the rover
Output: Current position of the rover
*/

package ics;

import mattj.Input;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Would you like the default position to be (0, 0): ");
        String input = Input.getWord().toLowerCase();
        Rover rover;
        if (input.contains("y")) {
            rover = new Rover();
        } else {
            System.out.print("Enter X Position: ");
            int xPos = (int)Input.getNumber();
            Input.getLine();
            System.out.print("Enter Y Position: ");
            int yPos = (int)Input.getNumber();
            Input.getLine();
            System.out.print("Enter Direction (N,E,S,W): ");
            input = Input.getWord().toLowerCase();
            Input.getLine();
            if (input.contains("n")) {
                rover = new Rover(xPos, yPos, RoverDirection.NORTH);
            } else if (input.contains("s")) {
                rover = new Rover(xPos, yPos, RoverDirection.SOUTH);
            } else if (input.contains("w")) {
                rover = new Rover(xPos, yPos, RoverDirection.WEST);
            } else {
                rover = new Rover(xPos, yPos, RoverDirection.EAST);
            }
        }
        int forward = 1;
        while (true) {
            System.out.print("Enter Command: ");
            input = Input.getWord().toLowerCase();

            if (input.equalsIgnoreCase("disconnect"))
                break;
            if (input.equals("start")) {
                rover.start();
            } else if (input.equals("stop")) {
                rover.stop();
            } else if (input.contains("f")) {
                if (forward>1) {
                    rover.forward(forward);
                } else {
                    rover.forward();
                }
            } else if (input.contains("r")) {
                rover.turnRight();
            } else if (input.contains("l")) {
                rover.turnLeft();
            }
            rover.printPosition();
        }
        rover.printPosition();
        System.out.println("Goodbye.");
    }
}
