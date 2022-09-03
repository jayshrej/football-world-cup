# football-world-cup
Implementation of the Football World Cup Score Board as a simple library.


Assumptions: 
1. The scores can be >=0.
2. The score board should display only the active games. 
3. Summary: Those games with the same total score
will be returned ordered by the most recently added to our system.
4. Heap memory should be configured for the max allowed active matches.

Time and Space complexity calculations: 
1. Time complexity of the algorithm: O(n)
2. Space complexity is: O(n), due to use of an extra list in getSummaryByTotalScore() method.

Main file: com.worldcup.football.main.WorldCupMain.java