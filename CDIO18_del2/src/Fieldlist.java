
public class Fieldlist 
{
	private Field[] fieldList = new Field[11];
	
	public Fieldlist()
	{
		fieldList[0] = new Field(250, "Tower", "You have found a mysterious tower and chest lays inside, you've gained 250 gold");
		fieldList[1] = new Field(-100, "Crater", "You have found a big crater, you must spend 100 gold to fill it out");
		fieldList[2] = new Field(100, "Palace gates", "You stand in front of some big palace gates, might be usefull, you get a 100 gold");
		fieldList[3] = new Field(-20, "Cold desert", "You've found yourself in a very cold dersert, you are freezing and must get a cup of coffee, you've paid 20 gold");
		fieldList[4] = new Field(180, "Walled city", "You are now inside of a walled city, and have the time to save up some money, you've gained 180 gold");
		fieldList[5] = new Field(0, "Monastery", "It appears to be at the monastery, nothing really happens here, nothing happened");
		fieldList[6] = new Field(-70, "Black cave", "You're inside the black cave, it's dark in here and you must light an expensive candle, you lost 70 gold");
		fieldList[7] = new Field(60, "Huts in the mountain", "You've found some huts in the mountain, you can get some rest and also someone left 60 gold, you found 60 gold");
		fieldList[8] = new Field(-80, "The Werewall", "You have encountered a wall of wolves, you run for your life on the fly, some gold pops out for your pocket, you lost 80 gold but gain an extra turn");
		fieldList[9] = new Field(-50, "The pit", "You've fallen in a pit, you pay a stranger to help you up, you lost 50 gold");
		fieldList[10] = new Field(650, "Goldmine", "You have found the goldmine, alot of shining gold awaits you! you gained 650 gold, you are rich!");
	}
	
	public Field getField(int index)
	{
		return fieldList[index];
	}
	public Field[] getFields() 
	{ 
		return fieldList; 
	}
}
