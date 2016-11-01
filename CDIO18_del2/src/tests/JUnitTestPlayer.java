package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class JUnitTestPlayer {

	@Test
	public void testPLayer() {
		
		Player p = new Player(1 ,"Knud");
	
		assertEquals("Knud", p.getName());
		assertEquals(1, p.getAccount().getSum());
		
		p.setName("Brian");
		assertEquals("Brian", p.getName());
		
		p.getAccount().setSum(0);
		assertEquals(0, p.getAccount().getSum());
		
		p.getAccount().setSum(100);
		p.getAccount().addSum(200);
		assertEquals(300, p.getAccount().getSum());
		
		
		assertEquals(p.getAccount(), p.getAccount());
		
		
	}

}
