package com.worldcup.football.game;

import com.worldcup.football.model.Match;

public class Game {
	private Match match;	
	
	public Match getMatch() {
		return match;
	}

	@Override
	public String toString() {
		return "Game [match=" + match  + "]";
	}

	public void startGame(String homeTeam, String awayTeam) {
		match = new Match(homeTeam, awayTeam);
		ScoreBoard.addMatch(match);
	}

	public void finishGame() {
		ScoreBoard.remove(this.match);
	}

	public void updateScore(Integer homeScore, Integer awayScore) {
		if(homeScore<0 || awayScore<0) {
			this.match.getScores().setHomeTeamScore(0);
			this.match.getScores().setAwayTeamScore(0);
		}else {
		this.match.getScores().setHomeTeamScore(homeScore);
		this.match.getScores().setAwayTeamScore(awayScore);
		}
	}

}
