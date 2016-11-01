package game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Gamecontroller {

	private Player player2;
	private Player player1;
	private Dicecup cup;
	private game.Field[] list = new Fieldlist().getFields();
	private int maxSum = 3000;

	public static void main(String[] args) {
		new Gamecontroller().go();
	}

	public void go(){
		cup = new Dicecup();
		player2 = new Player(1000,"Bijan");
		player1 = new Player(1000,"GangsterJohn");

		Field[] fields = new Field[11];

		fields[0] = new Street.Builder().setBgColor(new Color (0,191,255)).setTitle(list[0].getName()).setRent(list[0].getValue() +",-").setDescription(list[0].getDescription()).setSubText("2").build();
		fields[1] = new Street.Builder().setBgColor(new Color (0,0,0)).setFgColor(new Color (250,250,250)).setTitle(list[1].getName()).setRent(list[1].getValue() +",-").setDescription(list[1].getDescription()).setSubText("3").build();
		fields[2] = new Street.Builder().setBgColor(new Color (255,140,0)).setTitle(list[2].getName()).setRent(list[2].getValue() +",-").setDescription(list[2].getDescription()).setSubText("4").build();
		fields[3] = new Street.Builder().setBgColor(new Color (250,250,250)).setTitle(list[3].getName()).setRent(list[3].getValue() +",-").setDescription(list[3].getDescription()).setSubText("5").build();
		fields[4] = new Street.Builder().setBgColor(new Color (0,0,255)).setFgColor(new Color (250,250,250)).setTitle(list[4].getName()).setRent(list[4].getValue() +",-").setDescription(list[4].getDescription()).setSubText("6").build();
		fields[5] = new Street.Builder().setBgColor(new Color (255,20,147)).setTitle(list[5].getName()).setRent(list[5].getValue() +",-").setDescription(list[5].getDescription()).setSubText("7").build();
		fields[6] = new Street.Builder().setBgColor(new Color (0,0,0)).setFgColor(new Color (250,250,250)).setTitle(list[6].getName()).setRent(list[6].getValue() +",-").setDescription(list[6].getDescription()).setSubText("8").build();
		fields[7] = new Street.Builder().setBgColor(new Color (255,69,0)).setTitle(list[7].getName()).setRent(list[7].getValue() +",-").setDescription(list[7].getDescription()).setSubText("9").build();
		fields[8] = new Street.Builder().setBgColor(new Color (0)).setFgColor(new Color (250,250,250)).setTitle(list[8].getName()).setRent(list[8].getValue() +",-").setDescription(list[8].getDescription()).setSubText("10").build();
		fields[9] = new Street.Builder().setBgColor(new Color (0,0,0)).setFgColor(new Color (250,250,250)).setTitle(list[9].getName()).setRent(list[9].getValue() +",-").setDescription(list[9].getDescription()).setSubText("11").build();
		fields[10] = new Street.Builder().setBgColor(new Color (255,215,0)).setTitle(list[10].getName()).setRent(list[10].getValue() +",-").setDescription(list[10].getDescription()).setSubText("12").build();


		GUI.create(fields);

		Car car1 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();

		Car car2 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.BLACK)
				.secondaryColor(Color.RED)
				.build();

		GUI.addPlayer(player2.getName(), player2.account.getSum(),car1);
		GUI.addPlayer(player1.getName(), player1.account.getSum(),car2);

		System.out.println("setup done");

		update();
	}

	public void update(){
		System.out.println("update køre");
		while(true){
			GUI.showMessage(player2.getName() + "`s turn.");
			turn(player2);
			winner(player2);


			GUI.showMessage(player1.getName() + "`s turn.");
			turn(player1);
			winner(player1);
		}

	}

	private void winner(Player p){
		if(p.account.getSum() >= maxSum){
			GUI.showMessage(p.getName() + " vandt dette spil!");

			GUI.showMessage("Lyst til et spil mere?");
			player2.account.setSum(1000);
			player1.account.setSum(1000);
			GUI.close();
		}
	}

	private void turn(Player p){

		GUI.removeAllCars(p.getName());

		cup.die1.roll();
		cup.die2.roll();

		System.out.println(cup.die1.getValue());
		System.out.println(cup.die2.getValue());

		GUI.setDice(cup.die1.getValue(), cup.die2.getValue());

		switch (cup.getSum()) {


		case 2: 
			GUI.setCar(1,p.getName());
			GUI.showMessage(list[0].getDescription());
			p.account.addSum(list[0].getValue());

			System.out.println("flyttet til felt: " + 1);
			break;
		case 3:
			GUI.setCar(2,p.getName());
			GUI.showMessage(list[1].getDescription());
			p.account.addSum(list[1].getValue());

			System.out.println("flyttet til felt: " + 2);

			break;
		case 4:
			GUI.setCar(3,p.getName());
			GUI.showMessage(list[2].getDescription());
			p.account.addSum(list[2].getValue());

			System.out.println("flyttet til felt: " + 3);
			break;
		case 5: 
			GUI.setCar(5,p.getName());
			GUI.showMessage(list[3].getDescription());
			p.account.addSum(list[3].getValue());

			System.out.println("flyttet til felt: " + 4);
			break;
		case 6: 
			GUI.setCar(5,p.getName());
			GUI.showMessage(list[4].getDescription());
			p.account.addSum(list[4].getValue());

			System.out.println("flyttet til felt: " + 5);
			break;
		case 7:  
			GUI.setCar(6,p.getName());
			GUI.showMessage(list[5].getDescription());
			p.account.addSum(list[5].getValue());

			System.out.println("flyttet til felt: " + 6);
			break;
		case 8: 
			GUI.setCar(7,p.getName());
			GUI.showMessage(list[6].getDescription());
			p.account.addSum(list[6].getValue());

			System.out.println("flyttet til felt: " + 7);
			break;
		case 9:  
			GUI.setCar(8,p.getName());
			GUI.showMessage(list[7].getDescription());
			p.account.addSum(list[7].getValue());

			System.out.println("flyttet til felt: " + 8);

			break;
		case 10: 
			GUI.setCar(9,p.getName());
			GUI.showMessage(list[8].getDescription());
			p.account.addSum(list[8].getValue());

			System.out.println("flyttet til felt: " + 9);
			GUI.showMessage("Sick bro! You got an extra turn! Yippie :D");
			turn(p);
			break;
		case 11:
			GUI.setCar(10,p.getName());
			GUI.showMessage(list[9].getDescription());
			p.account.addSum(list[9].getValue());

			System.out.println("flyttet til felt: " + 10);
			break;
		case 12: 
			GUI.setCar(11,p.getName());
			GUI.showMessage(list[10].getDescription());
			p.account.addSum(list[10].getValue());

			System.out.println("flyttet til felt: " + 11);
			break;
		default: 
			System.err.println("Fejl i turn() parameter");
			break;

		}	
		GUI.setBalance(p.getName(), p.account.getSum());
		System.out.println("værdi" + cup.getSum());
	}

}
