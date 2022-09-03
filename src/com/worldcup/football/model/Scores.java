package com.worldcup.football.model;

public class Scores implements Comparable<Scores>{
	private Integer homeTeamScore;
	private Integer awayTeamScore;
	
	public Scores () {		
		this.awayTeamScore=this.homeTeamScore=0;
	}

	public Scores(int i, int j) {
		this.homeTeamScore = i;
		this.awayTeamScore = j;
	}

	public Integer getHomeTeamScore() {
		return homeTeamScore;
	}

	public void setHomeTeamScore(Integer homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}

	public Integer getAwayTeamScore() {
		return this.awayTeamScore;
	}

	public void setAwayTeamScore(Integer awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}

	@Override
	public String toString() {
		return this.homeTeamScore + "-" + this.awayTeamScore;
	}

	public Integer getSumOfScores() {
		return this.awayTeamScore+ this.homeTeamScore;
	}
	
	@Override
	public int compareTo(Scores o) {
		return -1*this.getSumOfScores().compareTo(o.getSumOfScores());
		
	}

}
