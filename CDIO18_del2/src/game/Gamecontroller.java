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
		new Gamecontroller().setup();
	}

	public void setup(){
		cup = new Dicecup();
		player2 = new Player(0,"Spiller 1 - Mathias");
		player1 = new Player(0,"Spiller 2 - Ronni");

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

		GUI.addPlayer(player2.getName(), player2.getAccount().getSum(),car1);
		GUI.addPlayer(player1.getName(), player1.getAccount().getSum(),car2);

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
		if(p.getAccount().getSum() >= maxSum){
			GUI.showMessage(p.getName() + " vandt dette spil!");

			GUI.showMessage("Lyst til et spil mere?");
			player2.getAccount().setSum(1000);
			player1.getAccount().setSum(1000);
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

		if(list[cup.getSum()-2].landOn(p, cup.getSum()-1)) turn(p);
		
		GUI.setBalance(p.getName(), p.getAccount().getSum());
		System.out.println("værdi" + cup.getSum());
	}

}
