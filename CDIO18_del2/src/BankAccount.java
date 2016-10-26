
public class BankAccount {

	private int balance;
	private int bankId;
	private int maxSum;

	public BankAccount(int balance){
		balance = balance;
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

	public int getId() {
		return bankId;
	}

	public void setId(int id) {
		bankId = id;
	}

	public boolean isEmpty(){
		if(balance <= 0){
			return true;
		}
		else 
		return false;
	}
	
	public boolean Full(){
		if(maxSum < balance){
			return true;
		}
		else 
		return false;
	}
	
	

}
