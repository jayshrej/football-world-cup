package com.worldcup.football.game;

import com.worldcup.football.model.Match;
import com.worldcup.football.model.Scores;

public class Game {
	private Match match;	
	private Scores scores;	
	
	public Game() {
		
	}
	
	public void startGame(String homeTeam, String awayTeam) {
		match= new Match(homeTeam,awayTeam,new Scores(0,0));
		ScoreBoard.addMatch(match);
	}
	
	public void finishGame() {
		ScoreBoard.remove(this.match);
	}
	
	public void updateScore(Integer homeScore, Integer awayScore) {
		this.match.getScores().setHomeTeamScore(homeScore);
		this.match.getScores().setAwayTeamScore(awayScore);		
	}
		
}
