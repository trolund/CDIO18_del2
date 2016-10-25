import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Gamecontroller {

	
	
	public static void main(String[] args) {
		
		
		// opsætning af spille plade med spillere
		Player player1 = new Player(true,1,3000,0);
		Player player2 = new Player(false,2,3000,0);
		
		Field[] fields = new Field[8];
		fields[0] = new Street.Builder().setTitle("Start").build();
		fields[1] = new Street.Builder().setTitle("Felt 1").setRent("600,-").build();
		fields[2] = new Street.Builder().setTitle("Felt 2").setRent("600,-").build();
		fields[3] = new Street.Builder().setTitle("Felt 3").setRent("600,-").build();
		fields[4] = new Street.Builder().setTitle("Felt 4").setRent("600,-").build();
		fields[5] = new Street.Builder().setTitle("Felt 5").setRent("600,-").build();
		fields[6] = new Street.Builder().setTitle("Felt 6").setRent("600,-").build();
		fields[7] = new Street.Builder().setTitle("Felt 7").setRent("600,-").build();
		GUI.create(fields);
		
		Car car1 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car2 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.BLACK)
				.secondaryColor(Color.red)
				.build();
		
		GUI.addPlayer("Player1", (int) player1.account.getSum(),car1);
		GUI.addPlayer("Player2", (int) player2.account.getSum(),car2);
		
		
		// eks på sæt terning
		
		GUI.setDice(3, 4);
	}

}
