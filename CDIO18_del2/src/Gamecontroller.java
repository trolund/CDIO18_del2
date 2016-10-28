import java.awt.Button;

import java.awt.Color;

import Test.Testdata;
import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Gamecontroller {
	
	
	private Player player1;
	private Player player2;
	private Dicecup cup;
	
	public static void main(String[] args) {
		new Gamecontroller().go();
	}
	
	public void go(){	
		cup = new Dicecup();
		player1 = new Player(0,"Knud");
		player2 = new Player(0,"Brian");
		
		Field[] fields = new Field[8];
		fields[0] = new Street.Builder().setTitle("Start").build();
		fields[1] = new Street.Builder().setTitle("Felt 1").setRent("600,-").build();
		fields[2] = new Street.Builder().setTitle("Felt 2").setRent("600,-").build();
		fields[3] = new Street.Builder().setTitle("Felt 3").setRent("600,-").build();
		fields[4] = new Street.Builder().setTitle("Felt 4").setRent("600,-").build();
		fields[5] = new Street.Builder().setTitle("Felt 5").setRent("600,-").build();
		fields[6] = new Street.Builder().setTitle("Felt 6").setRent("600,-").build();
		fields[7] = new Street.Builder().setTitle("Felt 7").setRent("600,-").setSubText("du er bare god").build();
		GUI.create(fields);

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
		
		GUI.addPlayer(player1.getName(), player1.account.getSum(),car1);
		GUI.addPlayer(player2.getName(), player2.account.getSum(),car2);
		
		System.out.println("setup done");
		
		update();
	}
	
	public void update(){
		while(true){
			GUI.showMessage("Player 1 tur.");
			turn(player1);
			GUI.showMessage("Player 2 tur.");
			turn(player2);
			}
	}
	
	private void turn(Player p){
		
		cup.die1.roll();
		cup.die2.roll();
		
		
		 switch (cup.getSum()) {

		 case 2: 
			 p.account.addSum(600);
		 break;
		 case 3:
			 p.account.addSum(600);
		 break;
		 case 4:
			 p.account.addSum(600);
		 break;
		 case 5: 
			 p.account.addSum(600);
		 break;
		 case 6: 
			 p.account.addSum(600);
		 break;
		 case 7:  
			 p.account.addSum(600);
		 break;
		 case 8: 
			 p.account.addSum(600);
		 break;
		 case 9:  
			 p.account.addSum(600);
		 break;
		 case 10: 
			 p.account.addSum(600);
		 break;
		 case 11:
			 p.account.addSum(600);
		 break;
		 case 12: 
			 p.account.addSum(600);
		 break;
		 default: 
			 p.account.addSum(600);
		 break;

     }	
		 GUI.setBalance(p.getName(), p.account.getSum());
		 GUI.setDice(cup.die1.getValue(), cup.die2.getValue());
		
	}

}
