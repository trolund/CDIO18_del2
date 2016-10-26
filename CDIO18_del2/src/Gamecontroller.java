import java.awt.Button;

import java.awt.Color;

import Test.Testdata;
import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Gamecontroller {
	
	
	Player player1;
	Player player2;
	Dicecup cup;
	Field[] fields;
	
	public static void main(String[] args) {
		new Gamecontroller().go();
	}
	
	private void go(){	
		cup = new Dicecup();

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
		
		player1 = new Player(0,"Knud");
		player2 = new Player(0,"Brian");
		
		GUI.addPlayer(player1.getName(), player1.account.getSum(),car1);
		GUI.addPlayer(player2.getName(), player2.account.getSum(),car2);
		
		fields = new Field[8];
		fields[0] = new Street.Builder().setTitle("Start").build();
		fields[1] = new Street.Builder().setTitle("Felt 1").setRent("600,-").build();
		fields[2] = new Street.Builder().setTitle("Felt 2").setRent("600,-").build();
		fields[3] = new Street.Builder().setTitle("Felt 3").setRent("600,-").build();
		fields[4] = new Street.Builder().setTitle("Felt 4").setRent("600,-").build();
		fields[5] = new Street.Builder().setTitle("Felt 5").setRent("600,-").build();
		fields[6] = new Street.Builder().setTitle("Felt 6").setRent("600,-").build();
		fields[7] = new Street.Builder().setTitle("Felt 7").setRent("600,-").setSubText("du er bare god").build();
		
		GUI.create(fields);
		
		update();
	}
	
	public void update(){
		while(true){
			turn(player1);
			GUI.showMessage("Player 1 tur.");
			
			cup.die1.roll();
			cup.die2.roll();
			
			player1.account.addSum(cup.getSum());
			
			GUI.setDice(cup.die1.getValue(), cup.die2.getValue());
			GUI.setBalance(player1.getName(), player1.account.getSum());
			
			
			
			turn(player2);
			GUI.showMessage("Player 2 tur.");
			
			cup.die1.roll();
			cup.die2.roll();
			
			player2.account.addSum(cup.getSum());
			
			GUI.setDice(cup.die1.getValue(), cup.die2.getValue());
			GUI.setBalance(player2.getName(), player2.account.getSum());
			}
	}
	
	private void turn(Player p){
		
		 switch (cup.getSum()) {

//		 case 2:  monthString = "February";
//		 break;
//		 case 3:  monthString = "March";
//		 break;
//		 case 4:  monthString = "April";
//		 break;
//		 case 5:  monthString = "May";
//		 break;
//		 case 6:  monthString = "June";
//		 break;
//		 case 7:  monthString = "July";
//		 break;
//		 case 8:  monthString = "August";
//		 break;
//		 case 9:  monthString = "September";
//		 break;
//		 case 10: monthString = "October";
//		 break;
//		 case 11: monthString = "November";
//		 break;
//		 case 12: monthString = "December";
//		 break;
//		 default: monthString = "Invalid month";
//		 break;
     }
	
		
		
		
		
	}

}
