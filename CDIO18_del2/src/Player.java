
public class Player {
	
	private Boolean playerturn;
	private int playerId;
	private double maxSum;
	private double startSum;
	
	
	public Player(boolean playerturn, int playerId, double maxSum, double startSum) {
		this.playerturn = playerturn;
		this.playerId = playerId;
		this.maxSum = maxSum;
		this.startSum = startSum;
	}
	
	
	
	public Boolean getPlayerturn() {
		return playerturn;
	}

	public void setPlayerturn(Boolean playerturn) {
		this.playerturn = playerturn;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	BankAccount account  = new BankAccount(startSum,playerId,maxSum);
	
}
