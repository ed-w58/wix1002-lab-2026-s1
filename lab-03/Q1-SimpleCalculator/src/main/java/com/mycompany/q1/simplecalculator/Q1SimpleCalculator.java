package com.mycompany.q1.simplecalculator;

import java.util.Scanner;

public class Q1SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter the operand: ");
        char operator = sc.next().charAt(0);
        sc.nextLine();
        
        int result = 0;
        switch (operator) {
            case '+' :
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
                
            case '-' :
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
                
            case '*' :
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
                
            case '/' :
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                }
                else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
                
            case '%' :
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                }
                else {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operand!");
        }
    }
}
