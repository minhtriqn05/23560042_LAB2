package ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        System.out.println("Initial value: " + dice.getValue());

        System.out.print("Enter the number of rolls n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("n must be positive.");
            scanner.close();
            return;
        }

        int[] count = new int[7];              // count[1]..count[6], index 0 is not used
        for (int i = 0; i < n; i++) {
            count[dice.roll()]++;
        }

        System.out.println("Last value: " + dice.getValue());
        System.out.println("Face | Count | Experimental probability");
        for (int face = 1; face <= 6; face++) {
            double p = (double) count[face] / n;
            System.out.println(String.format(Locale.US, "  %d  | %5d | %.4f", face, count[face], p));
        }
        System.out.println(String.format(Locale.US, "Theoretical probability of each face = 1/6 = %.4f", 1.0 / 6));

        scanner.close();
    }
}
