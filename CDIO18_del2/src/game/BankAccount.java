package game;

public class BankAccount {

	private int balance;

	public BankAccount(int balance){
		this.balance = balance >= 0 ? balance : 0;
	}

	public int getSum() {
		return balance;
	}
	
	public String sumToString(){
		return String.format("%1$2s %2$2s", getSum(), "kr");
	}

	public void setSum(int sum) {
		balance = sum >= 0 ? sum : 0;
	}

	public void addSum(int x) {
		balance += x;
		if (x < 0 && x * (-1) > balance)
		balance = 0;
			
		
	}	
	
	
	public boolean withdraw(int x) {
		if(x > 0){
		balance -= x;
		return true;
		}
		else {
			return false;	
		}	
	}
	

}
