
public class BankAccount {

	private int sum;
	private int bankId;
	private int maxSum;

	public BankAccount(int balance){
		sum = balance;
	}

	public double getSum() {
		return sum;
	}
	
	public String sumToString(){
		return String.format("%1$2s %2$2s", getSum(), "kr");
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void addSum(int x) {
		this.sum += x;
	}

	public int getId() {
		return bankId;
	}

	public void setId(int id) {
		bankId = id;
	}

	public boolean isEmpty(){
		if(sum <= 0){
			return true;
		}
		else 
		return false;
	}
	
	public boolean Full(){
		if(maxSum < sum){
			return true;
		}
		else 
		return false;
	}
	
	

}
