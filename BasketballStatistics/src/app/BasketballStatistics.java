/* Author: Matt Cruickshank
Class: ICS4U

Program: Intro To Java, BasketBall Statistics
Input: Names of players, shots taken, shots scored
Processing: Percentage of shots going in
Output: Player with the best percentage*/

package app;

import java.util.Scanner;

public class BasketballStatistics {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        int[] shots = new int[5];
        int[] baskets = new int[5];
        double[] percentage = new double[5];

        for (int i=0; i<5; i++) {
            System.out.print("Name " + (i+1) + ": ");
            names[i] = input.next();
            System.out.print("Shots taken: ");
            shots[i] = input.nextInt();
            System.out.print("Shots scored: ");
            baskets[i] = input.nextInt();
        }

        for (int i=0; i<5; i++) {
            percentage[i] = (double)baskets[i]/(double)shots[i]*100.0;
            System.out.printf("%S-%.2f%n", names[i], percentage[i]);
        }
        input.close();
    }
}