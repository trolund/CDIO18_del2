
public class Player {
	
	private Boolean playerturn;
	private int playerId;
	private int bankid;
	private double maxSum;
	
	BankAccount account  = new BankAccount(0,bankid,maxSum);
	
	public Player(boolean playerturn, int playerId, int bankid, double maxSum) {
		this.playerturn = playerturn;
		this.playerId = playerId;
		this.bankid = bankid;
		this.maxSum = maxSum;
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

	
	
	
	
}
