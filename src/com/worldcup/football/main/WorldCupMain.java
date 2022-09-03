package com.worldcup.football.main;

import com.worldcup.football.game.Game;
import com.worldcup.football.game.ScoreBoard;

public class WorldCupMain {
	
	public static void main(String args[]) {
		Game mexicoVsCanada= new Game();
		Game spainVsBrazil= new Game();
		Game germanyVsFrance= new Game();
		Game uruguayVsItaly= new Game();
		Game argentinaVsAustralia= new Game();	
		
		mexicoVsCanada.startGame("Mexico", "Canada");
		mexicoVsCanada.updateScore(0, 5);
		
		spainVsBrazil.startGame("Spain","Brazil");
		spainVsBrazil.updateScore(10, 2);
		
		germanyVsFrance.startGame("Germany","France");
		germanyVsFrance.updateScore(2, 2);
		
		uruguayVsItaly.startGame("Uruguay","Italy");
		uruguayVsItaly.updateScore(6, 6);
		
		argentinaVsAustralia.startGame("Argentina", "Australia");
		argentinaVsAustralia.updateScore(3, 1);	
		
		ScoreBoard.showScoreBoard();
		
		// Finished games should be removed from the Score board
		uruguayVsItaly.finishGame();		
		ScoreBoard.showScoreBoard();
		
		//Score shouldn't be less than 0
		argentinaVsAustralia.updateScore(-3, -1);
		ScoreBoard.showScoreBoard();
		
		
	}

}
