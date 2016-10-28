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
	private Fieldlist list;
	
	public static void main(String[] args) {
		new Gamecontroller().go();
	}
	
	public void go(){	
		cup = new Dicecup();
		player1 = new Player(0,"Knud");
		player2 = new Player(0,"Mille");
		list = new Fieldlist();
		
		Field[] fields = new Field[8];
		fields[0] = new Street.Builder().setTitle("Start").build();
		fields[1] = new Street.Builder().setTitle(list.fields[1].getName()).setRent(list.fields[1].getValue() +",-").build();
		fields[2] = new Street.Builder().setTitle(list.fields[2].getName()).setRent(list.fields[2].getValue() +",-").build();
		fields[3] = new Street.Builder().setTitle(list.fields[3].getName()).setRent(list.fields[3].getValue() +",-").build();
		fields[4] = new Street.Builder().setTitle(list.fields[4].getName()).setRent(list.fields[4].getValue() +",-").build();
		fields[5] = new Street.Builder().setTitle(list.fields[5].getName()).setRent(list.fields[5].getValue() +",-").build();
		fields[6] = new Street.Builder().setTitle(list.fields[6].getName()).setRent(list.fields[6].getValue() +",-").build();
		fields[7] = new Street.Builder().setTitle(list.fields[7].getName()).setRent(list.fields[7].getValue() +",-").build();
		
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
		System.out.println("update køre");
		while(true){
			GUI.showMessage(player1.getName() + "`s turn.");
			turn(player1);
			GUI.showMessage(player2.getName() + "`s turn.");
			turn(player2);
			}
		
	}
	
	private void turn(Player p){
		
		cup.die1.roll();
		cup.die2.roll();
		
		 GUI.setDice(cup.die1.getValue(), cup.die2.getValue());
		 
		 switch (cup.getSum()) {

		 case 2: 
			 GUI.showMessage(list.fields[1].getDescription());
			 p.account.addSum(list.fields[1].getValue());
			 
		 break;
		 case 3:
			 GUI.showMessage(list.fields[2].getDescription());
			 p.account.addSum(list.fields[2].getValue());
		 break;
		 case 4:
			 GUI.showMessage(list.fields[3].getDescription());
			 p.account.addSum(list.fields[3].getValue());
		 break;
		 case 5: 
			 GUI.showMessage(list.fields[4].getDescription());
			 p.account.addSum(list.fields[4].getValue());
		 break;
		 case 6: 
			 GUI.showMessage(list.fields[5].getDescription());
			 p.account.addSum(list.fields[5].getValue());
		 break;
		 case 7:  
			 GUI.showMessage(list.fields[6].getDescription());
			 p.account.addSum(list.fields[6].getValue());
		 break;
		 case 8: 
			 GUI.showMessage(list.fields[7].getDescription());
			 p.account.addSum(list.fields[7].getValue());
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
		
		
	}

}
