package randomstatistics;

import java.util.Locale;
import java.util.Random;

public class RandomStatistics {
    public static void main(String[] args) {
        Random random = new Random();
        int first = random.nextInt(41) + 10;
        int second = random.nextInt(41) + 10;
        int third = random.nextInt(41) + 10;
        int sum = first + second + third;
        double average = sum / 3.0;
        System.out.printf("Numbers: %d, %d, %d%n", first, second, third);
        System.out.println("Sum: " + sum);
        System.out.printf(Locale.US, "Average: %.2f%n", average);
    }
}