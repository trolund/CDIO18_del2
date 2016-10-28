
public class Dicecup {

	Die die1 = new Die();
	Die die2 = new Die();

	public int getSum(){
		return (int) die1.roll() + die2.roll(); 

	}
}
