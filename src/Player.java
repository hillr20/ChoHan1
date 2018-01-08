import java.util.Random;
public class Player {
	
	private String guess;
	private int points;
	//private String name;
	
	public Player() {
		guess = "";
		points = 0;
	}
	
	//guess Cho (even) or Han (odd)
	public void guess() {
		//random?
		//stuff
	}
	
	public void addPoints (int newPoints) {
		points += newPoints;
	}
	
	public String getGuess() {
		return guess;
	}
	
	public int getPoints() {
		return points;
	}
	

}
