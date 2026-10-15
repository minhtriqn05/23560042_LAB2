package ex2;

/**
 * Exercise 2: a fraction numerator/denominator. The denominator is never 0.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    // No-argument constructor: 0/1.
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Parameterized constructor. A zero denominator is not allowed, so it is replaced by 1.
    // The sign is always kept in the numerator (3/-4 becomes -3/4).
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Warning: denominator cannot be 0, it is set to 1.");
            denominator = 1;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Copy constructor: creates a new, independent object with the same values.
    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    // Greatest common divisor (Euclid's algorithm), used by simplify().
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Divides numerator and denominator by their GCD (changes this object).
    public void simplify() {
        int g = gcd(numerator, denominator);
        if (g > 1) {
            numerator /= g;
            denominator /= g;
        }
    }

    // a/b + c/d = (ad + cb) / bd
    public Fraction add(Fraction other) {
        Fraction result = new Fraction(numerator * other.denominator + other.numerator * denominator,
                denominator * other.denominator);
        result.simplify();
        return result;
    }

    // a/b - c/d = (ad - cb) / bd
    public Fraction subtract(Fraction other) {
        Fraction result = new Fraction(numerator * other.denominator - other.numerator * denominator,
                denominator * other.denominator);
        result.simplify();
        return result;
    }

    // a/b * c/d = ac / bd
    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(numerator * other.numerator, denominator * other.denominator);
        result.simplify();
        return result;
    }

    // a/b : c/d = ad / bc  (not possible when c/d = 0)
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            System.out.println("Error: cannot divide by a zero fraction, 0/1 is returned.");
            return new Fraction();
        }
        Fraction result = new Fraction(numerator * other.denominator, denominator * other.numerator);
        result.simplify();
        return result;
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
}
