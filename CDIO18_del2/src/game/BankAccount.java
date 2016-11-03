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

	public boolean setSum(int sum) {
		if(sum >= 0){
			balance = sum;
			return true;
		}
			return false;
	}

	public boolean addSum(int x) {
		balance += x;
		if (x < 0 && x * (-1) > balance){
		balance = 0; 
		return false;
		}
		return true;
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
