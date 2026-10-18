package digitsum;

import java.util.Random;

public class DigitSum {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10001);
        int ones = number % 10;
        int tens = (number % 100) / 10;
        int hundreds = (number % 1000) / 100;
        int thousands = number / 1000 % 10;
        int tenThousands = number /10000;
        int sum = ones + tens + hundreds + thousands + tenThousands;
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
            
    }
}
