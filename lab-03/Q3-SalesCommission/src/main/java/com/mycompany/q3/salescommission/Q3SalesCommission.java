package com.mycompany.q3.salescommission;

import java.util.Scanner;

public class Q3SalesCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sales volume: ");
        double sales = sc.nextDouble();
        sc.nextLine();
        
        double commission = 0;
        if (sales <= 100 && sales >=0) {
            commission = sales * 0.05;
            System.out.printf("Commission: %.2f%n", commission);
        }
        else if (sales > 100 && sales <= 500) {
            commission = sales * 0.075; 
            System.out.printf("Commission: %.2f%n", commission);
        }
        else if (sales > 500 && sales <= 1000) {
            commission = sales * 0.1;
            System.out.printf("Commission: %.2f%n", commission);
        }
        else if (sales > 1000) {
            commission = sales * 0.125;
            System.out.printf("Commission: %.2f%n", commission);
        }
        else {
            System.out.println("Invalid sales volume.");
        }
    }
}
