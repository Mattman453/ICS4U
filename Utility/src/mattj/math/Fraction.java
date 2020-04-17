/*
Author: Matt Cruickshank
Purpose: Create fractions that keep their whole numbers rather than use decimal places
*/
package mattj.math;

public class Fraction {

    protected int numerator;
    protected int denominator;

    // Create a simple fraction with placeholder numbers
    public Fraction() {
        this(1, 1);
    }

    // Create a fraction with integer values for the top and bottom
    public Fraction(final int numerator, final int denomenator) {
        this.numerator = numerator;
        this.denominator = denomenator;
        simplify();
    }

    // Simplify a fraction so that it is in its easiest form to use
    protected boolean simplify() {
        for (int i = 2; i < 999999999; i++) {
            if ((numerator % i) == 0 && (denominator % i) == 0) {
                numerator /= i;
                denominator /= i;
                return true;
            }
        }
        return false;
    }

    // Convert the fraction into a double
    public double toDouble() {
        return (double) numerator / (double) denominator;
    }

    // Return a string containing a formated version of a fraction
    public String toString() {
        final String part1 = Integer.toString(numerator);
        final String part2 = "/";
        final String part3 = Integer.toString(denominator);
        return part1 + part2 + part3;
    }
}