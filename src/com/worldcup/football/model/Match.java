package com.worldcup.football.model;

public class Match {
	private PlayerTeams players;	
	private Scores scores;	

	public Match(String homeTeam, String awayTeam) {
		this.players= new PlayerTeams(homeTeam,awayTeam);		
		this.scores=new Scores();
	}
	@Override
	public String toString() {
		return players + " - " + scores ;
	}
	public Match() {}
	
	public Scores getScores() {
		return this.scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}

}
