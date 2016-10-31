
public class BankAccount {

	private int balance;

	public BankAccount(int balance){
		this.balance = balance;
	}

	public int getSum() {
		return balance;
	}
	
	public String sumToString(){
		return String.format("%1$2s %2$2s", getSum(), "kr");
	}

	public void setSum(int sum) {
		this.balance = sum;
	}

	public void addSum(int x) {
		this.balance += x;
	}	

}
