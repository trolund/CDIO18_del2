
public class Gamecontroller {

	
	
	public static void main(String[] args) {
		
		Player player1 = new Player(true,1,1,3000);
		Player player2 = new Player(false,2,2,3000);
		
		player2.account.addSum(200);
		
		System.out.println(player1.account.sumToString());

		
	}

}
