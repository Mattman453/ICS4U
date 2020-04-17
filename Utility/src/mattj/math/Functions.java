/*
Author: Matt Cruickshank
Purpose: Allow the making of functions to determine output from points and an input
*/
package mattj.math;

public class Functions {

    // Create a linear function and clamp it between a minimum and a maximum
    public static double scaleAndClamp(double input, double inLow, double inHigh, double outLow, double outHigh) {
        final double m = (outHigh - outLow) / (inHigh - inLow);
        final double b = outLow - inLow * m;
        double output = m * input + b;
        if (output > outHigh) {
            output = outHigh;
        }
        if (output < outLow) {
            output = outLow;
        }
        return output;
    }

    // A linear equation from a premade equation
    public static double linear(double input, double slope, double offset) {
        return ((slope*input)+offset);
    }

    // A linear equation derived from 2 points represented as arrays
    public static double linear(double input, double[] point1, double[] point2) {
        return linear(input, point1[0], point2[0], point1[1], point2[1]);
    }

    // A linear equation derived from 2 points represented by separated points
    public static double linear(double input, double x1, double x2, double y1, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (x1 * m);
        double y = (m * input) + b;
        return y;
    }

    // A quadratic equation with 1 x-intercept
    public static double quadratic(double input, double xIntercept) {
        return Functions.power(input-xIntercept, 2);
    }

    // A quadratic equation using 2 x-intercepts
    public static double quadratic(double input, double xIntercept1, double xIntercept2) {
        return ((input-xIntercept1)*(input-xIntercept2));
    }

    // A quadratic equation in standard form
    public static double quadratic(double input, double a, double b, double c) {
        return (a*(Functions.power(input, 2)) + (b*input) + c);
    }

    // Returns a number to an exponent that is predefined
    public static double power(double input, int exponent) {
        if (exponent==0) {
            return 1;
        } else if (exponent>0) {
            double output = input;
            for (int i=1; i<exponent; i++) {
                output*=input;
            }
            return output;
        } else {
            double output = 1.0;
            for (int i=0; i>exponent; i--) {
                output/=input;
            }
            return output;
        }
    }

    // Returns the mean number of an array of doubles
    public static double average(double[] numbers) {
        int length = numbers.length;
        double total = 0;
        for (int i = 0; i < length; i++) {
            total += numbers[i];
        }
        return total / length;
    }
}