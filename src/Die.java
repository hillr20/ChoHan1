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
	

}
