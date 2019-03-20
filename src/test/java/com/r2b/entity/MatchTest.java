package com.r2b.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatchTest {

	Match match;
	
	@Test
	public void displayScoreTest () {
		Player p1 = new Player("Rafik", 3);
		Player p2 = new Player("Massi", 2);
		
		match = new Match(p1, p2);
		
		Integer result = match.displayScore(3);
		assertEquals("must be equals ", "40", result.toString());
	}
	
	@Test
	public void isLastPointTest() {
		Player p1 = new Player("Rafik", 3);
		Player p2 = new Player("Massi", 2);
		
		match = new Match(p1, p2);
		
		boolean result = match.isLastPoint();
		
		assertEquals("must be equals",  false, result);
	}
	
	@Test
	public void incrementeScoreTest() {
		Player p1 = new Player("Rafik");
		Player p2 = new Player("Massi");
		
		match = new Match(p1, p2);
		
		p1.setScore(3);
		p2.setScore(2);
		
		assertEquals("must be equals",  "3", p1.getScore().toString());
		match.incrementeScore(p1);
		assertEquals("must be equals",  "0", p1.getScore().toString());
		
		assertEquals("must be equals",  "2", p2.getScore().toString());
		match.incrementeScore(p2);
		assertEquals("must be equals",  "3", p2.getScore().toString());
	}

}
