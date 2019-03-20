package com.r2b.dv;

/**
 * 
 * @author Rafik BOUGHANI
 *
 * @date 20 mars 2019
 *
 * @email rafik.boughani@gmail.com
 */
public enum ScoreEnum {

	QUINZE("1"), 
	TRENTE("2"), 
	QUARENTE("3");

	private String value;

	ScoreEnum(String envUrl) {
		this.value = envUrl;
	}

	public String getValue() {
		return value;
	}
}
