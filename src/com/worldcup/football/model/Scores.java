package com.worldcup.football.model;

public class Scores {
	private Integer homeTeamScore;
	private Integer awayTeamScore;	
	
	public Scores(int i, int j) {
		this.homeTeamScore=i;
		this.awayTeamScore=j;
	}
	public Integer getHomeTeamScore() {
		return homeTeamScore;
	}
	public void setHomeTeamScore(Integer homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}
	public Integer getAwayTeamScore() {
		return awayTeamScore;
	}
	public void setAwayTeamScore(Integer awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}
	@Override
	public String toString() {
		return homeTeamScore + "-" + awayTeamScore ;
	}	

}
