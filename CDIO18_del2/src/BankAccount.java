
public class BankAccount {

	private double sum;
	private int id;
	private double maxSum;

	public BankAccount(double balance, int id, double maxSum){
		sum = balance;
		this.id = id;
		this.maxSum = maxSum;
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
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
