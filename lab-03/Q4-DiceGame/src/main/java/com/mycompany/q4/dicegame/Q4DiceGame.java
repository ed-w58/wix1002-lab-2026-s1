package com.mycompany.q4.dicegame;

import java.util.Random;

public class Q4DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int p1d1 = rand.nextInt(1,7);
        int p1d2 = rand.nextInt(1,7);
        int p2d1 = rand.nextInt(1,7);
        int p2d2 = rand.nextInt(1,7);
        
        System.out.println("Player 1 rolls " + p1d1 + " and " + p1d2 + ".");
        System.out.println("Player 2 rolls " + p2d1 + " and " + p2d2 + ".");
        int player1 = p1d1 + p1d2;
        int player2 = p2d1 + p2d2;
        
        if (player1 > player2) {
            System.out.println(player1 + " > " + player2 + "\nPlayer 1 wins!");
        }
        else if (player2 > player1) {
            System.out.println(player2 + " > " + player1 + "\nPlayer 2 wins!");
        }
        else {
            System.out.println("It's a draw!");
        }
    }
}
