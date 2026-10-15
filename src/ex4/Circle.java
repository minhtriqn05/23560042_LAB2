package ex4;

import java.util.Locale;

/**
 * Exercise 4: a circle C(a, b, r) with center (centerX, centerY) and radius r.
 */
public class Circle {

    private double centerX;
    private double centerY;
    private double radius;

    // Default constructor: unit circle centered at (0, 0).
    public Circle() {
        this(0, 0, 1);
    }

    // Parameterized constructor. A non-positive radius is replaced by 1.
    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = (radius > 0) ? radius : 1;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // A point is inside or on the circle when its distance to the center is <= r.
    // Squared distances are compared to avoid Math.sqrt; 1e-9 handles rounding errors.
    public boolean contains(double x, double y) {
        double dx = x - centerX;
        double dy = y - centerY;
        return dx * dx + dy * dy <= radius * radius + 1e-9;
    }

    public void displayInfo() {
        System.out.println(String.format(Locale.US,
                "C(%.1f, %.1f, %.1f) | area = %.2f | perimeter = %.2f",
                centerX, centerY, radius, area(), perimeter()));
    }
}
