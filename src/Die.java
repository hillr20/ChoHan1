import java.util.Random;
public class Die {
	//attributes
	private int sides;
	private int value;
	
	public Die (int numSides) {
		sides = numSides;
		roll();
	}
	public void roll(){ 
	      Random randroll = new Random();
	  
	      value = randroll.nextInt(sides) + 1;
	   }
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return value;
	}
	
	
	//need classes, Dealer, Die, LoadedDie, maybe Player...
	//loaded
	//generate a random number between 1-100, 1-20 = 1, 21-40=3... one idea for a loaded die
	//check the other tabs/windows...

}
