package com.r2b.dv;

/**
 * 
 *
 * @author Rafik BOUGHANI
 * @email rafik.boughani@gmail.com
 * @date 20 mars 2019
 *
 */
public enum ScoreEnum {

	UN(15), 
	DEUX(30), 
	TROIS(40);

	private Integer value;

	ScoreEnum(Integer envUrl) {
		this.value = envUrl;
	}

	public Integer getValue() {
		return value;
	}
}
