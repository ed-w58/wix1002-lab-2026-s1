package com.mycompany.temperatureconversion;
import java.util.Locale;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter your temperature in farhenheit: ");
        double f = scanner.nextDouble();
        double d = (f - 32) / 1.8;
        System.out.printf(Locale.US, "Celsius: %.2f%n", d);
    }
}
   