import java.awt.Button;
import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Gamecontroller {

	
	public static void main(String[] args) {
		new Gamecontroller().go();
	}
	
	private void go(){
		
		
		// opsætning af spille plade med spillere
		Player player1 = new Player(true,1,3000,200);
		Player player2 = new Player(false,2,3000,0);
	
		Dicecup cup = new Dicecup();

		Car car1 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();

		Car car2 = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.BLACK)
				.secondaryColor(Color.RED)
				.build();
		
		
		GUI.addPlayer("Player1",0,car1);
		GUI.addPlayer("Player2",0,car2);
		GUI.setDice(cup.die1.roll(), cup.die2.roll());
	}

}
