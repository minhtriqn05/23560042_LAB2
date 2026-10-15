package ex6;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Java picks the overload by looking at the number and types of the arguments.
        System.out.println("add(2, 3)       = " + calc.add(2, 3)
                + "    -> add(int, int)");
        System.out.println("add(2.5, 3.1)   = " + calc.add(2.5, 3.1)
                + "  -> add(double, double)");
        System.out.println("add(1, 2, 3)    = " + calc.add(1, 2, 3)
                + "    -> add(int, int, int)");
        System.out.println("add(2, 3.5)     = " + calc.add(2, 3.5)
                + "  -> add(double, double), 2 is widened to 2.0");
        System.out.println("max(7, 12)      = " + calc.max(7, 12)
                + "   -> max(int, int)");
        System.out.println("max(7.5, -2.25) = " + calc.max(7.5, -2.25)
                + "  -> max(double, double)");
    }
}
