/*
Author: Matt Cruickshank
Purpose: Do any math with fractions to simplify thought process when making other equations involving fractions
*/

package mattj.math;

public class FractionMath {

    // Adds a number to a fraction
    public static Fraction addFraction(final Fraction fraction, double addition) {
        addition *= fraction.denominator;
        fraction.numerator += addition;
        fraction.simplify();
        return fraction;
    }

    // Adds two fractions together
    public static Fraction addFraction(Fraction fraction1, Fraction fraction2) {
        final Fraction temp = fraction1;
        fraction1 = FractionMath.multiplyFraction(fraction1, fraction2.denominator);
        fraction2 = FractionMath.multiplyFraction(fraction2, temp.denominator);
        final Fraction output = new Fraction((fraction1.numerator + fraction2.numerator), fraction1.denominator);
        return output;
    }

    // Takes away a whole number from a fraction
    public static Fraction subtractFraction(final Fraction fraction, double subtraction) {
        subtraction *= fraction.denominator;
        fraction.numerator -= subtraction;
        return fraction;
    }

    // Takes away one fraction from another
    public static Fraction subtractFraction(Fraction fraction1, Fraction fraction2) {
        final Fraction temp = fraction1;
        fraction1 = FractionMath.multiplyFraction(fraction1, fraction2.denominator);
        fraction2 = FractionMath.multiplyFraction(fraction2, temp.denominator);
        final Fraction output = new Fraction((fraction1.numerator - fraction2.numerator), fraction1.denominator);
        return output;
    }

    // Multiplies a fraction by a whole number
    public static Fraction multiplyFraction(final Fraction fraction, final double factor) {
        fraction.numerator *= factor;
        fraction.denominator *= factor;
        fraction.simplify();
        return fraction;
    }

    // Multiplies a fraction by another fraction
    public static Fraction multiplyFraction(final Fraction fraction1, final Fraction fraction2) {
        final Fraction output = new Fraction((fraction1.numerator * fraction2.numerator),
                (fraction1.denominator * fraction2.denominator));
        return output;
    }

    // Divides a fraction by a whole number
    public static Fraction divideFraction(final Fraction fraction, final double divisor) {
        final Fraction output = new Fraction((int) divisor, 1);
        return divideFraction(fraction, output);
    }

    // Divides a fraction by another fraction
    public static Fraction divideFraction(final Fraction fraction1, final Fraction fraction2) {
        final Fraction output = new Fraction((fraction1.numerator * fraction2.denominator),
                (fraction1.denominator * fraction2.numerator));
        return output;
    }
}