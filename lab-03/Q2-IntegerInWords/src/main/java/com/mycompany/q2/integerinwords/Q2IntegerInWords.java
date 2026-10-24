package com.mycompany.q2.integerinwords;

import java.util.Random;

public class Q2IntegerInWords {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int x = rand.nextInt(6);
        
        switch (x){
            case 0:
                System.out.println(x + " is zero.");
                break;
            case 1:
                System.out.println(x + " is one.");
                break;
            case 2:
                System.out.println(x + " is two.");
                break;
            case 3:
                System.out.println(x + " is three.");
                break;
            case 4:
                System.out.println(x + " is four.");
                break;
            case 5:
                System.out.println(x + " is five.");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
