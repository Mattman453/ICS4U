/*Author: Matthew Cruickshank
Class: ICS4U

Program: General utility to avoid extra variables clogging up main program
Input: Calls from other programs
Processing: Get requested information and do math
Output: Requested information
 */

package ics.mattj;

import java.util.Scanner;

public class Utility {
    private static Scanner grab = new Scanner(System.in);

    public static double scaleAndClamp(double input, double inLow, double inHigh, double outLow, double outHigh) {
        double m = (outHigh-outLow)/(inHigh-inLow);
        double b = outLow-inLow*m;
        double output = m * input + b;
        if (output>outHigh) {
            output = outHigh;
        }
        if (output<outLow) {
            output = outLow;
        }
        return output;
    }

    public static boolean isInRange(double units, double required, double marginOfError) {
        if (units > (required+marginOfError)) {
            return false;
        } else if (units < (required-marginOfError)) {
            return false;
        } else {
            return true;
        }
    }

    public static double cutoff(double input, double stop) {
        if (input>stop) {
            return stop;
        } else if (input<(stop*-1)) {
            return (stop*-1);
        } else {
            return input;
        }
    }

    public static double averageArray(double[] input) {
        double total = 0;
        double size = input.length;
        for (double v : input) {
            total += v;
        }
        return total/size;
    }

    public static double getNumber() {
        return grab.nextDouble();
    }

    public static String getString() {
        return grab.next();
    }

    public static String getLine() {
        return grab.nextLine();
    }

    public static boolean getBool() {
        return grab.nextBoolean();
    }

    public static boolean isPrime(int input) {
        for (int i=2; i<input; i++) {
            if (input%i==0) {
                return false;
            }
        }
        return true;
    }
}
