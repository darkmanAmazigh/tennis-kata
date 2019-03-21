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
		
		StringBuilder result = new StringBuilder();
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
        while (!gameOver ) {
        	String command = scanner.nextLine();
            switch (command) {
                case "1":
                	match.incrementeScore(firstPlayer);
                    break;
                case "2":
                	match.incrementeScore(secondPlayer);
                    break;
                case "d":
                    
                    printPoint(result, match, firstPlayer, secondPlayer);
                    System.err.println(result);
                    System.out.println("------------------------------");
                    break;
                default:
                    break;
            }
            if (match.getWinner() != null) {
                gameOver=true;
                printPoint(result, match, firstPlayer, secondPlayer);
                System.err.println(result);
            } 
        }
	}

	private static void printPoint(StringBuilder result, Match match, Player firstPlayer, Player secondPlayer) {
		result.append("\n");
		result.append(""+match.getPlayer1().getName());
        for (Integer item : match.getPlayer1().getAllPoint()) {
        	result.append(" \t "+item);
        }
        if(match.getWinner() != null) {
        	result.append(" \t ");
        	result.append(firstPlayer.getScore());
        	result.append(" \t ");
        	result.append((match.getWinner().equals(firstPlayer)) ? match.getWinner().getName()+" win the game" : "");
        }
        result.append("\n");
        result.append(""+match.getPlayer2().getName());
        for (Integer item : match.getPlayer2().getAllPoint()) {
        	result.append(" \t "+item);
        }
        if(match.getWinner() != null) {
        	result.append(" \t ");
        	result.append(secondPlayer.getScore());
        	result.append(" \t ");
        	result.append((match.getWinner().equals(secondPlayer)) ? match.getWinner().getName()+" win the game" : "");
        }
        result.append("\n");
	}
}
