package game;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFieldlist 
{

	@Test
	public void test01() 
	{
		int exsValue;
		String exsName;
		String exsDescription;
		Fieldlist fdList = new Fieldlist();
		
		exsValue = fdList.getField(0).getValue();
		exsName = fdList.getField(0).getName();
		exsDescription = fdList.getField(0).getDescription();

		assertEquals(exsValue, 250);
		assertEquals(exsName, "Tower");
		assertEquals(exsDescription, "You have found a mysterious tower and chest lays inside, you've gained 250 gold");		
	}
}
