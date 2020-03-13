package ics.mattj;

import java.util.Scanner;

public class Main {
    // Grab length and width from user, output perimeter and area of a rectangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create an object to grab items from the terminal
        System.out.print("What is the length of the rectangle: "); // Print to the terminal
        double length = input.nextDouble(); // Grab a double from the terminal
        System.out.print("What is the width of the rectangle: "); // Print to the terminal
        double width = input.nextDouble(); // Grab a double from the terminal
        double perimeter = (length*2) + (width*2); // Find perimeter of the rectangle
        double area = length*width; // Find area of the rectangle
        System.out.println("The perimeter of the rectangle is " + perimeter + "."); // Print the perimeter of the rectangle
        System.out.println("The are of the rectangle is " + area + "."); // Print the area of the rectangle
	// write your code here
    }
}
