/*
Author: Matt Cruickshank
Purpose: The purpose of this class is to avoid declaring a scanner in every project.
*/
package mattj;

import java.util.Scanner;

public class Input {

    // Scanner for terminal inputs
    final public static Scanner scanner = new Scanner(System.in);

    // Grab the whole line from the terminal
    public static String getLine() {
        return scanner.nextLine();
    }

    // Grab a number from the terminal. Use parenthesis to convert to int if needed
    public static double getNumber() {
        return scanner.nextDouble();
    }

    // Grab the next word in the terminal
    public static String getWord() {
        return scanner.next();
    }
}