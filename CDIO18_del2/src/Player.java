
public class Player {
	
	private Boolean playerturn;
	private int playerId;
	
	Player(){
		this(false,0);
	}
	
	Player(boolean playerturn){
		this(playerturn,0);
	}
	
	Player(int id){
		this(false,id);
	}
	
	public Player(boolean playerturn, int playerId) {
		this.playerturn = playerturn;
		this.playerId = playerId;
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
