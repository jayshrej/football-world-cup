package com.worldcup.football.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.worldcup.football.model.Match;

public class ScoreBoard {
	public static ArrayList<Match> matches = new ArrayList<>();

	public static void remove(Match match) {
		matches.remove(match);
	}

	public static void addMatch(Match match) {
		matches.add(match);
	}

	public static void getSummaryByTotalScore() {
		Comparator<Match> matchComparator = (Match m1, Match m2) -> m1.getScores().compareTo(m2.getScores());
		ArrayList<Match> originalMatchList= new ArrayList<>();
		
		for(int i=0;i<matches.size();i++)
			originalMatchList.add(matches.get(i));
		
		
		Collections.sort(matches, matchComparator);
		for(int i=1;i<matches.size();i++) {
			if(matches.get(i).getScores().getSumOfScores()
					.equals(matches.get(i-1).getScores().getSumOfScores())
						&& originalMatchList.indexOf(matches.get(i))>originalMatchList.indexOf(matches.get(i-1))){
				swapMatches(i);
				
			}
		}
		
	}

	private static void swapMatches(int i) {
		Match tempMatch= new Match();
		tempMatch=matches.get(i-1);
		matches.set(i-1, matches.get(i));
		matches.set(i,tempMatch);
	}


	public static void showScoreBoard() {
		getSummaryByTotalScore();
		System.out.println("Score Board:");

		for (Match match : matches) {
			System.out.println(match);
		}

	}

}
