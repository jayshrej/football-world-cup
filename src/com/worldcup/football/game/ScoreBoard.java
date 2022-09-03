package com.worldcup.football.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.worldcup.football.model.Match;

public class ScoreBoard {
	public static ArrayList<Match> matches = new ArrayList<>();

	public static void remove(Match match) {
		matches.remove(match);
	}
	
	/**
     * Adds a new match to the score baord. 
     * @param   match Match to be added.
     * @return  void
     */
	public static void addMatch(Match match) {
		matches.add(match);
	}
	
	/**
     * Generates the summary for the score board. 
     * @param   void
     * @return  void
     */
	public static void getSummaryByTotalScore() {
		Comparator<Match> matchComparator = (Match m1, Match m2) -> m1.getScores().compareTo(m2.getScores());
		ArrayList<Match> originalMatchList = new ArrayList<>();

		for (int i = 0; i < matches.size(); i++)
			originalMatchList.add(matches.get(i));

		Collections.sort(matches, matchComparator);
		for (int i = 1; i < matches.size(); i++) {
			if (matches.get(i).getScores().getSumOfScores().equals(matches.get(i - 1).getScores().getSumOfScores())
					&& originalMatchList.indexOf(matches.get(i)) > originalMatchList.indexOf(matches.get(i - 1))) {
				swapMatches(i);

			}
		}
	}
	/**
     * Swaps the Match class objects for a given list index. 
     * @param   i index of the element for swapping with its earlier index element.
     * @return  void
     */
	private static void swapMatches(int i) {
		Match tempMatch = new Match();
		tempMatch = matches.get(i - 1);
		matches.set(i - 1, matches.get(i));
		matches.set(i, tempMatch);
	}

	/**
     * Shows the live score board of the football world cup. 
     * @param   void
     * @return  void
     */
	public static void showScoreBoard() {
		getSummaryByTotalScore();
		System.out.println("\nScore Board:");

		for (Match match : matches) {
			System.out.println(match.getPlayers().getHomeTeam()+" "+ match.getScores().getHomeTeamScore()+" - "+ match.getPlayers().getAwayTeam()+" "+ match.getScores().getAwayTeamScore());
		}

	}

}
