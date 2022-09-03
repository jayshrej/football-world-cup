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

	 /**
     * Starts the game for given two teams.    
     * @param   homeTeam   the name of the first team.
     * @param	awayTeam   the name of the second team.
     * @return  void
     */
	public void startGame(String homeTeam, String awayTeam) {
		match = new Match(homeTeam, awayTeam);
		ScoreBoard.addMatch(match);
	}

	/**
     * Finishes the current game.    
     * @param  void
     * @return  void
     */
	public void finishGame() {
		ScoreBoard.remove(this.match);
	}

	/**
     * Updates the game score for two teams.    
     * @param   homeScore   the score of the first team.
     * @param	awayScore   the score of the second team.
     * @return  void
     */
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
