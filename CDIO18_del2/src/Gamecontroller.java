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

//		Field[] fields = new Field[8];
//		fields[0] = new Street.Builder().setTitle("Start").build();
//		fields[1] = new Street.Builder().setTitle("Felt 1").setRent("600,-").build();
//		fields[2] = new Street.Builder().setTitle("Felt 2").setRent("600,-").build();
//		fields[3] = new Street.Builder().setTitle("Felt 3").setRent("600,-").build();
//		fields[4] = new Street.Builder().setTitle("Felt 4").setRent("600,-").build();
//		fields[5] = new Street.Builder().setTitle("Felt 5").setRent("600,-").build();
//		fields[6] = new Street.Builder().setTitle("Felt 6").setRent("600,-").build();
//		fields[7] = new Street.Builder().setTitle("Felt 7").setRent("600,-").setSubText("du er bare god").build();
//		GUI.create(fields);
//
//		Car car1 = new Car.Builder()
//				.typeRacecar()
//				.patternHorizontalDualColor()
//				.primaryColor(Color.RED)
//				.secondaryColor(Color.BLUE)
//				.build();
//
//		Car car2 = new Car.Builder()
//				.typeUfo()
//				.patternHorizontalDualColor()
//				.primaryColor(Color.BLACK)
//				.secondaryColor(Color.RED)
//				.build();
//
//		GUI.addPlayer("Player1",0,car1);
//		GUI.addPlayer("Player2",0,car2);
//
//
//		GUI.setDice(cup.die1.roll(), cup.die2.roll());
	}

}
