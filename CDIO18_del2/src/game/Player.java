package game;

public class Player {
	
	private String name;
	BankAccount account;
	
	public Player(int balance, String name) {
		this.name = name;
		account = new BankAccount(balance);
	}	
	
	
	public BankAccount getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
}
