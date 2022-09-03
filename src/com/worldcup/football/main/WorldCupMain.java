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
		spainVsBrazil.startGame("Spain","Brazil");			
		germanyVsFrance.startGame("Germany","France");			
		uruguayVsItaly.startGame("Uruguay","Italy");			
		argentinaVsAustralia.startGame("Argentina", "Australia");
		ScoreBoard.showScoreBoard();
		
		mexicoVsCanada.updateScore(0, 5);
		spainVsBrazil.updateScore(10, 2);
		germanyVsFrance.updateScore(2, 2);
		uruguayVsItaly.updateScore(6, 6);
		argentinaVsAustralia.updateScore(3, 1);		
		ScoreBoard.showScoreBoard();		

		uruguayVsItaly.finishGame();		
		ScoreBoard.showScoreBoard();
				
		argentinaVsAustralia.updateScore(-3, -1);
		ScoreBoard.showScoreBoard();
		
		mexicoVsCanada.finishGame();
		spainVsBrazil.finishGame();
		germanyVsFrance.finishGame();
		argentinaVsAustralia.finishGame();	
		ScoreBoard.showScoreBoard();
		
	}

}
