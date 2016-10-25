
public class Player {
	
	private Boolean playerturn;
	private int playerId;
	BankAccount account;
	
	public Player(boolean playerturn, int playerId, int startSum) {
		this.playerturn = playerturn;
		this.playerId = playerId;
		account = new BankAccount(startSum);
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
