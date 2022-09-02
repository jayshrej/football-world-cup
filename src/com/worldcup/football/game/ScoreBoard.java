package com.worldcup.football.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.worldcup.football.model.Match;

public class ScoreBoard {
	public static ArrayList<Match> matches= new ArrayList<>();	
	
	public static void remove(Match match) {
		matches.remove(match);		
	}
	
	public static void addMatch(Match match) {
		matches.add(match);
	}
	
	public static void getSummaryByTotalScore (){
		Collections.sort(matches);
	}
	
	public static void showScoreBoard() {
		getSummaryByTotalScore ();
		
		System.out.println("Score Board:");
		
		for(Match match: matches) {
			System.out.println(match);
		}
		
	}


}
