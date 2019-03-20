package com.r2b.entity;

public class Match {

	Player player1;
	Player player2;
	
	/**
	 * Initialize score
	 */
	public Match () {
		this.player1.setScore(0);
		this.player2.setScore(0);
	}
	
	/**
	 * Increment player score
	 * @param p
	 */
	public void incrementeScore(Player p) {
		p.setScore(p.getScore() + 1);
	}
}
