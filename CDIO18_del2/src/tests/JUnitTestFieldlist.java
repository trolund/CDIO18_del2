package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import game.Field;
import game.Fieldlist;

public class JUnitTestFieldlist 
{
	@Test
	public void test01() 
	{
		int exsValue;
		String exsName;
		String exsDescription;
		Field[] fdList = new Fieldlist().getFields();
		
		exsValue = fdList[0].getValue();
		exsName = fdList[0].getName();
		exsDescription = fdList[0].getDescription();

		assertEquals(exsValue, 250);
		assertEquals(exsName, "Tower");
		assertEquals(exsDescription, "You have found a mysterious tower and chest lays inside, you've gained 250 gold");		
	}
}
