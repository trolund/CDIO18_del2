package game;

import desktop_resources.GUI;

public class Field 
{
//	private int no = 0;
	private int value = 0;
	private String name = "None";
	private String description = "";
	private boolean extraTurn = false;
	
	public Field(int value, String name, String description, boolean extraTurn){
		this( value, name, description);
		this.extraTurn = extraTurn;
	}
	public Field(int value, String name, String description)
	{
		this.value = value;
		this.name = name;
		this.description = description;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public boolean landOn(Player p, int no){
		GUI.setCar(no,p.getName());
		GUI.showMessage(getDescription());
		p.getAccount().addSum(getValue());

		System.out.println("Flyttet til felt: " + no);
		return extraTurn;
	}
	
	public String toString()
	{
		return 	"Value: " + value + "\n" + 
				"Name: " + name + "\n" + 
				"Description: " + description;
	}
}
