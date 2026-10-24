package com.mycompany.q6.pointincircle;

import java.util.Scanner;

public class Q6PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter coordinate x: ");
        double x = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Enter coordinate y: ");
        double y = sc.nextDouble();
        sc.nextLine();
        
        double distance = Math.sqrt(x * x + y * y);
        
        if (distance <= radius) {
            System.out.printf("Point (%.2f, %.2f) is inside the circle.\n", x, y);
        }
        else {
            System.out.printf("Point (%.2f, %.2f) is outside the circle.\n", x, y);
        }
        sc.close();
    }
}
