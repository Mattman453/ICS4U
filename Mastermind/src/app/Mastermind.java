/*
Author: Mr. Park
Class: Mind Yo Bidness
*/

package app;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    static Random random = new Random();
    static int[] correctCombination = new int[4];
    static int properPlace = 0;
    static int properNumber = 0;
    static boolean correct = false;
    static Scanner scanner = new Scanner(System.in);

    public static boolean check(final int thou, final int hund, final int tens, final int ones) {
        properNumber = 0;
        properPlace = 0;

        if (thou == correctCombination[0]) {
            properPlace++;
        } else if (thou == correctCombination[1] || thou == correctCombination[2] || thou == correctCombination[3]) {
            properNumber++;
        }

        if (hund == correctCombination[1]) {
            properPlace++;
        } else if (hund == correctCombination[0] || hund == correctCombination[2] || hund == correctCombination[3]) {
            properNumber++;
        }

        if (tens == correctCombination[2]) {
            properPlace++;
        } else if (tens == correctCombination[0] || tens == correctCombination[1] || tens == correctCombination[3]) {
            properNumber++;
        }

        if (ones == correctCombination[3]) {
            properPlace++;
        } else if (ones == correctCombination[0] || ones == correctCombination[1] || ones == correctCombination[2]) {
            properNumber++;
        }
        System.out.printf("You have %d number in the right place and %d number correct but not in place.%n",
                properPlace, properNumber);
        if (properPlace == 4) {
            return true;
        }
        return false;
    }

    public static boolean guess(final int guesses) {
        int input = 0;
        System.out.printf("Enter guess %d. Use 4 numbers(No Spaces):", guesses);
        input = scanner.nextInt();
        final int numberOne = input % 10;
        int numberTwo = (input % 100 - numberOne);
        int numberThree = (input % 1000 - numberTwo - numberOne);
        int numberFour = (input % 10000 - numberThree - numberTwo - numberOne);
        numberTwo /= 10;
        numberThree /= 100;
        numberFour /= 1000;
        return check(numberFour, numberThree, numberTwo, numberOne);
    }

    public static void main(final String[] args) throws Exception {
        for (int i = 0; i < 4; i++) {
            correctCombination[i] = random.nextInt(10);
        }
        int i = 0;
        while (!correct) {
            correct = guess(i + 1);
            i++;
        }
        System.out.println("It took " + i + " guesses to get the correct combination.");
    }
}