package com.r2b.entity;

import com.r2b.dv.ScoreEnum;
/**
 * All match datas
 *
 * @author Rafik BOUGHANI
 * @email rafik.boughani@gmail.com
 * @date 20 mars 2019
 *
 */
public class Match {

	private Player player1;
	private Player player2;
	private boolean lastPoint = false;
	private Player winner;
	private boolean gameOver;
	
	/**
	 * Initialize score of two players
	 */
	public Match (Player p1, Player p2) {
		this.player1 = p1;
		this.player2 = p2;
		this.player1.setScore(0);
		this.player2.setScore(0);
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	
	
	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	/**
	 * Increment player score
	 * @param p
	 */
	public void incrementeScore(Player p) {
		if (isLastPoint()){
			winner=p;
			reinitScore();
		}else {
			p.setScore(p.getScore() + 1);
			addTrace(p);
		}
	}
	
	/**
	 * table point history per player
	 * @param p
	 */
	private void addTrace(Player p) {
		
		p.getAllPoint().add(displayScore(p.getScore()));
		if (p.equals(this.player1)){
			this.player2.getAllPoint().add(displayScore(this.player2.getScore()));
		}else{
			this.player1.getAllPoint().add(displayScore(this.player1.getScore()));
		}
	}

	/**
	 * format score
	 * @param score
	 * @return
	 */
	public Integer displayScore(Integer score) {
		switch (score) {
			case 1 : return ScoreEnum.UN.getValue();
			case 2 : return ScoreEnum.DEUX.getValue();
			case 3: return ScoreEnum.TROIS.getValue();
			default: return 0;
		}
	}
	
	/**
	 * reinitialize score of the players
	 */
	private void reinitScore() {
		this.player1.setScore(0);
		this.player2.setScore(0);		
	}

	/**
	 * When two player has 40 point, the next player who win a point, w'll win the game
	 * @return
	 */
	public boolean isLastPoint() {
		if (this.player1.getScore().equals(3) && this.player2.getScore().equals(3)) {
			return true;
		}
		return false;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}
	
	

}
