/* Author: Matt Cruickshank
Class: ICS4U

Program: Intro To Java, Rock, Paper, Scissors
Input: Letters representing either rock, paper or scissors
Processing: Determine Who wins
Output: Winner*/
package app;

import mattj.utility.Utility;


public class RockPaperScissors {
    public static void main(String[] args) throws Exception {
        int player1Wins = 0, player2Wins = 0, ties = 0;
        do {
            String game = Utility.getWord();
            if (game.contains("Q") || game.contains("q"))
                break;
            char player1 = game.charAt(0);
            char player2 = game.charAt(1);
            if (player1=='R' || player1=='r') {
                if (player2=='R' || player2=='r') {
                    ties++;
                } else if (player2=='P' || player2=='p') {
                    player2Wins++;
                } else {
                    player1Wins++;
                }
            } else if (player1=='P' || player1=='p') {
                if (player2=='R' || player2=='r') {
                    player1Wins++;
                } else if (player2=='P' || player2=='p') {
                    ties++;
                } else {
                    player2Wins++;
                }
            } else {
                if (player2=='R' || player2=='r') {
                    player2Wins++;
                } else if (player2=='P' || player2=='p') {
                    player1Wins++;
                } else {
                    ties++;
                }
            }

            if (player1Wins==2) {
                System.out.printf("PLAYER ONE %d\n", ties);
                ties=0;
                player1Wins=0;
                player2Wins=0;
            } else if (player2Wins==2) {
                System.out.printf("PLAYER TWO %d\n", ties);
                ties=0;
                player1Wins=0;
                player2Wins=0;
                if (Utility.)
            }
        } while (true);
    }
}