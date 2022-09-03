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

	/**
     * Calculates the sum of scores for a match.
     *
     * @param   void
     * @return  total of the scores.
     *          
     */
	public Integer getSumOfScores() {
		return this.awayTeamScore+ this.homeTeamScore;
	}
	
	/**
     * Compares two match scores.
     * @param   o   the object to compare with.
     * @return  {@code -1} is sum of scores of current match is higher than the sum of scores of the argument score.
     * 			{@code 1} is sum of scores of current match is less than the sum of scores of the argument score.
     * 			{@code 0} is sum of scores of current match is equal to the sum of scores of the argument score.
     *   
     */
	@Override
	public int compareTo(Scores o) {
		return -1*this.getSumOfScores().compareTo(o.getSumOfScores());
		
	}

}
