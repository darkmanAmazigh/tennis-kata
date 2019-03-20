package com.r2b.entity;

import com.r2b.dv.ScoreEnum;

/**
 * The Player class
 *
 * @author Rafik BOUGHANI
 * @date 20 mars 2019
 *
 */
public class Player {

	private String name;
	private Integer score;

	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Player(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		if (this.score>3) {
			//call a  set
			return 0;
		}
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
}
