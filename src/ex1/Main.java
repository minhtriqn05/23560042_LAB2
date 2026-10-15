package ex1;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();            // no-argument constructor -> 1 x 1
        Rectangle r2 = new Rectangle(4, 2.5);      // valid size
        Rectangle r3 = new Rectangle(-3, 5);       // invalid width -> replaced by 1
        Rectangle r4 = new Rectangle(0, -2);       // both invalid -> 1 x 1

        System.out.println("r1 = new Rectangle()");
        r1.displayInfo();
        System.out.println("r2 = new Rectangle(4, 2.5)");
        r2.displayInfo();
        System.out.println("r3 = new Rectangle(-3, 5)");
        r3.displayInfo();
        System.out.println("r4 = new Rectangle(0, -2)");
        r4.displayInfo();

        System.out.println("Area of r2 = " + r2.area());
        System.out.println("Perimeter of r2 = " + r2.perimeter());
    }
}
