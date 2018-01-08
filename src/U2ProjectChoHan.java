
public class U2ProjectChoHan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxRounds = 5;
		//create dealer
		Dealer dealer = new Dealer();
		//create players
		Player player1 = new Player();
		Player player2 = new Player();
		
		//rounds
		for (int round = 0; round < maxRounds; round ++) {
			System.out.println("Now playing round " + round + 1);
			
			//roll
			dealer.rollDice();
			
			player1.guess();
			player2.guess();
			
			roundsResults(dealer, player1, player2);
			
			
		}

	}

}
