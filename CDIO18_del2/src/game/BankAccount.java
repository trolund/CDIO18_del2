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

	public Boolean setSum(int sum) {
		balance =  sum >= 0 ? sum : 0;
		return sum >=0 ? true : false; 
	}

	public boolean addSum(int x) {
		if(x > 0){
		balance += x;
		return true;
		}
		else {
			return false;	
		}	
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
