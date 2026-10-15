package ex5;

import java.util.Random;

/**
 * Exercise 5: a six-sided die that remembers its most recent roll.
 */
public class Dice {

    private int value;                         // most recent roll, always 1..6
    private final Random random = new Random();

    // Constructor: a new die shows 1.
    public Dice() {
        this.value = 1;
    }

    // Rolls the die: picks a random face 1..6, stores it and returns it.
    public int roll() {
        value = random.nextInt(6) + 1;         // nextInt(6) gives 0..5
        return value;
    }

    public int getValue() {
        return value;
    }
}
