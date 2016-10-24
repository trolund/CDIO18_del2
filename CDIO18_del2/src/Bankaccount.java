
public class Bankaccount {

	private double sum;
	private int id;

	Bankaccount(){
		this(0,0);
	}


	Bankaccount(int id){
		this(0,id);
	}

	public Bankaccount(double balance, int id){
		this.sum = balance;
		this.id = id;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void addSum(int x) {
		this.sum = sum + x;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
