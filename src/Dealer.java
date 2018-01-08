import javax.swing.JOptionPane;
public class Dealer {
	//attributes
	private int die1Value;
	private int die2Value;

	//constructor
	public Dealer() {
		die1Value = 0;
		die2Value = 0;
	}
	
	//This method rolls dice + saves values
	public void rollDice() {
		//create dice
		
		String input = JOptionPane.showInputDialog("Dice come with different number of sides. This game can be played with "
				+ "4-sided, 6-sided, 8-sided, 10-sided, 12-sided, and 20-sided dice. "
				+ "Please enter the number that corresponds"
				+ "with the number of sides your desired dice have.");
		
		int userSides = Integer.parseInt(input);
		
		//int sides = userSides;
		if (userSides == 4){
			int sides = 4;
		}
		
		if (userSides == 6){
			int sides = 6;
		}
		
		if (userSides == 8){
			int sides = 8; 	
		}
		
		if (userSides == 10){
			int sides = 10;
		}
		
		if (userSides == 12){
			int sides = 12;
		}
		
		if (userSides == 20){
			int sides = 20;
		}
		
		else {
			System.out.println("Please enter either 4, 6, 8, 10, 12, or 20.");
		}
	
		
		
		//create + roll
		Die die1 = new Die(sides);
		Die die2 = new Die(sides);
		
		//record values
		die1Value = die1.getValue();
		die2Value = die2.getValue();
		//String result;
		//returns result of dice roll as eiter Cho or Han
		public String getChoHan() {
			int sum = die1Value + die2Value;
			//even or odd
			if (sum % 2 == 0){
				String result = "Cho/even";
			}
			else {
				String result = "Han/odd";
			}
		return result;		
		
		
		//getters
		public int getDie1Value() {
			return die1Value;
		}
		
		public int getDie2Value() {
			return die2Value;
		}
		
		
			
		
	}
}
