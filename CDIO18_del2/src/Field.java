public class Field 
{
	private int value = 0;
	private String name = "None";
	private String description = "";
	
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
	
	public String toString()
	{
		return 	"Value: " + value + "\n" + 
				"Name: " + name + "\n" + 
				"Description: " + description;
	}
}