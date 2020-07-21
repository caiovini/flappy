package com.flappy.game.model;

import java.util.Map;

public class GameInformation {
	
	private float timer;
	private float birdHeight;
	private Map<String , Float> pipes;
	private int score;
	private int state;
	
	public GameInformation(float timer, float birdHeight, Map<String, Float> pipes , int score , int state) {
		
		this.timer = timer;
		this.birdHeight = birdHeight;
		this.pipes = pipes;
		this.score = score;
		this.state = state;
	}
	
	public float getTimer() {
		return timer;
	}
	public void setTimer(float timer) {
		this.timer = timer;
	}
	public float getBirdHeight() {
		return birdHeight;
	}
	public void setBirdHeight(float birdHeight) {
		this.birdHeight = birdHeight;
	}
	public Map<String, Float> getPipes() {
		return pipes;
	}
	public void setPipes(Map<String, Float> pipes) {
		this.pipes = pipes;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
