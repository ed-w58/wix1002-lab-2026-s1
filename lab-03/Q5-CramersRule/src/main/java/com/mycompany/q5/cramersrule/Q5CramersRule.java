package com.mycompany.q5.cramersrule;

import java.util.Scanner;

public class Q5CramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter f: ");
        double f = sc.nextDouble();
        sc.nextLine();
        
        double determinant = a * d - b * c;
        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        }
        else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.printf("x: %.2f%n" + "y: %.2f%n", x, y);
        }
    sc.close();
    }
}
