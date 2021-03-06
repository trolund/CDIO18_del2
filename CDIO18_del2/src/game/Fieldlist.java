package game;

 public class  Fieldlist 
{
	private Field[] fields = new Field[12];

	public Fieldlist()
	{
		fields[0] = new Field(250, "Tower", "You have found a mysterious tower and chest lays inside, you've gained 250 gold");
		fields[1] = new Field(-100, "Crater", "You have found a big crater, you must spend 100 gold to fill it out");
		fields[2] = new Field(100, "Palace gates", "You stand in front of some big palace gates, might be usefull, you get a 100 gold");
		fields[3] = new Field(-20, "Cold Desert", "You've found yourself in a very cold dersert, you are freezing and must get a cup of coffee, you've paid 20 gold");
		fields[4] = new Field(180, "Walled City", "You are now inside of a walled city, and have the time to save up some money, you've gained 180 gold");
		fields[5] = new Field(0, "Monastery", "You appears to be at the monastery, nothing really happens here, nothing happened");
		fields[6] = new Field(-70, "Black Cave", "You're inside the black cave, it's dark in here and you must light an expensive candle, you lost 70 gold");
		fields[7] = new Field(60, "Huts in the Mountain", "You've found some huts in the mountain, you get some rest and also someone left 60 gold, you found 60 gold");
		fields[8] = new Field(-80, "The Werewall", "You have encountered a wall of wolves, you run for your life. On the fly, some gold pops out for your pocket, you lost 80 gold");
		fields[9] = new Field(-50, "The Pit", "You've fallen into a pit, and Pitlord is coming. You quickly pay a stranger to help you up, you spend 50 gold");
		fields[10] = new Field(650, "Goldmine", "You have found the goldmine, alot of shining gold awaits you! you gained 650 gold, you are rich!");
	}
	
	public Field[] getFields()
	{
		return fields;
	}

	
}