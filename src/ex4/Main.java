package ex4;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();              // unit circle at (0, 0)
        Circle c2 = new Circle(0, 0, 5);
        Circle c3 = new Circle(2, -1, 3);
        Circle c4 = new Circle(1, 1, -4);      // invalid radius -> 1

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        c4.displayInfo();

        // inside, outside, on the circle, outside, on the circle, outside
        System.out.println("c1 contains (0.5, 0.5)? " + c1.contains(0.5, 0.5));
        System.out.println("c1 contains (1, 1)?     " + c1.contains(1, 1));
        System.out.println("c2 contains (3, 4)?     " + c2.contains(3, 4));
        System.out.println("c2 contains (4, 4)?     " + c2.contains(4, 4));
        System.out.println("c3 contains (2, 2)?     " + c3.contains(2, 2));
        System.out.println("c3 contains (5, 1)?     " + c3.contains(5, 1));
    }
}
