package ex1;

import java.util.Locale;

/**
 * Exercise 1: a rectangle described by its width and height.
 */
public class Rectangle {

    // Object data is private so other classes cannot set a negative size directly.
    private double width;
    private double height;

    // No-argument constructor: a 1 x 1 rectangle.
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Parameterized constructor: non-positive values are replaced by 1.
    public Rectangle(double width, double height) {
        this.width = (width > 0) ? width : 1;
        this.height = (height > 0) ? height : 1;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void displayInfo() {
        System.out.println(String.format(Locale.US,
                "Rectangle %.2f x %.2f | area = %.2f | perimeter = %.2f",
                width, height, area(), perimeter()));
    }
}
