package ex2;

public class Main {
    public static void main(String[] args) {
        Fraction f0 = new Fraction();          // 0/1
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, -4);     // sign moves to the numerator: -3/4

        System.out.print("f0 = ");
        f0.display();
        System.out.print("f1 = ");
        f1.display();
        System.out.print("f2 = ");
        f2.display();

        System.out.println("bad = new Fraction(5, 0):");
        Fraction bad = new Fraction(5, 0);     // denominator 0 is replaced by 1
        System.out.print("bad = ");
        bad.display();

        System.out.print("f1 + f2 = ");
        f1.add(f2).display();
        System.out.print("f1 - f2 = ");
        f1.subtract(f2).display();
        System.out.print("f1 * f2 = ");
        f1.multiply(f2).display();
        System.out.print("f1 / f2 = ");
        f1.divide(f2).display();

        System.out.println("f1 / f0:");
        Fraction q = f1.divide(f0);            // dividing by 0/1 is not allowed
        System.out.print("f1 / f0 = ");
        q.display();

        // simplify() changes the object itself
        Fraction f3 = new Fraction(6, 8);
        System.out.print("f3 before simplify = ");
        f3.display();

        // copy constructor: f4 is a different object with the same value
        Fraction f4 = new Fraction(f3);
        f3.simplify();
        System.out.print("f3 after simplify  = ");
        f3.display();
        System.out.print("f4 (copy of f3)    = ");
        f4.display();
        System.out.println("f3 == f4 ? " + (f3 == f4));

        Fraction sameRef = f3;                 // only copies the reference
        System.out.println("sameRef == f3 ? " + (sameRef == f3));
    }
}
