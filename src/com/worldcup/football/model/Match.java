package com.worldcup.football.model;

public class Match implements Comparable<Match>{
	private String homeTeam;
	private String awayTeam;
	
	@Override
	public String toString() {
		return homeTeam + " - " + awayTeam + ": "+scores ;
	}
	private Scores scores;	

	public Match(String homeTeam, String awayTeam, Scores scores) {
		this.homeTeam=homeTeam;
		this.awayTeam=awayTeam;
		this.scores=scores;
	}
	public Scores getScores() {
		return scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	@Override
	public int compareTo(Match o) {
			if((this.scores.getAwayTeamScore()+this.scores.getHomeTeamScore())>(o.scores.getAwayTeamScore()+o.scores.getAwayTeamScore())) {
				return -1;
			}else if((this.scores.getAwayTeamScore()+this.scores.getHomeTeamScore())<(o.scores.getAwayTeamScore()+o.scores.getAwayTeamScore())) {
				return 1;
			}
			return 0;
	}
	

}
