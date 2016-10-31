package Game;

public class Dicecup {

	Die die1 = new Die();
	Die die2 = new Die();

	public int getSum(){
		return die1.getValue() + die2.getValue(); 

	}

	public void specialCase(Die x, Die y){ 

		if(x.equals(y)){
			
		}
		
		
	}

}
