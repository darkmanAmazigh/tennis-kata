package com.r2b.main;

import java.util.Scanner;

import com.r2b.entity.Match;
import com.r2b.entity.Player;

/**
 * The main class
 * 
 * @author Rafik BOUGHANI
 * @email rafik.boughani@gmail.com
 * @date 20 mars 2019
 *
 */
public class Main {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		/* set first player name */
		System.out.print("Player 1 name :");
        Player firstPlayer = new Player(scanner.nextLine());
        
		/* set second player name */
        System.out.print("Player 2 name :");
        Player secondPlayer = new Player(scanner.nextLine());
        
        /*initialize match between two players*/
        Match match = new Match(firstPlayer, secondPlayer);
        
		boolean gameOver=false;
		
        /* start the match */
        while (!gameOver) {
        	String command = scanner.nextLine();
            switch (command) {
                case "1":
                	match.incrementeScore(firstPlayer);
                    break;
                case "2":
                	match.incrementeScore(secondPlayer);
                    break;
                case "d":
                    if (match.getWinner() != null) {
                        System.out.println(String.format("%s:\n SCORE : %d \t %s", firstPlayer.getName(),
                                match.displayScore(match.getPlayer1().getScore()), (match.getWinner().equals(firstPlayer)) ? match.getWinner().getName()+" win the game" : ""));
                        System.out.println(String.format("%s:\n SCORE : %d \t %s", secondPlayer.getName(),
                        		match.displayScore(match.getPlayer2().getScore()), (match.getWinner().equals(secondPlayer)) ? match.getWinner().getName()+" win the game" : ""));
                        gameOver=true;
                    } else {
                        System.out.println(String.format("%s:\n SCORE : %d \t", firstPlayer.getName(),
                        		match.displayScore(match.getPlayer1().getScore())));
                        System.out.println(String.format("%s:\n SCORE : %d \t", secondPlayer.getName(),
                        		match.displayScore(match.getPlayer2().getScore())));
                    }
                    System.out.println("------------------------------");
                    break;
                default:
                    break;
            }
        }
	}
}
