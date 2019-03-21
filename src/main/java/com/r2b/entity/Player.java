package com.r2b.entity;

import java.util.ArrayList;
import java.util.List;

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
	private List<Integer> allPoint = new ArrayList<Integer>();

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

	public List<Integer> getAllPoint() {
		return allPoint;
	}

	public void setAllPoint(List<Integer> allPoint) {
		this.allPoint = allPoint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allPoint == null) ? 0 : allPoint.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (allPoint == null) {
			if (other.allPoint != null)
				return false;
		} else if (!allPoint.equals(other.allPoint))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}
	
	
	
}
