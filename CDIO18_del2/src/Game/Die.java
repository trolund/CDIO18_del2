package Game;

public class Die {
	
	private int value;
	
	public int roll() { //opretter metode roll
		value = (int) (Math.random() * 6+1);
		return value; //returnere random tal mellem 0.0 og 1.0 * 6 + 1 dvs. en 6 sidet terning
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
