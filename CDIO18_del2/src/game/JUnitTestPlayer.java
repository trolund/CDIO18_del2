package game;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestPlayer {

	@Test
	public void testPLayer() {
		
		Player p = new Player(1 ,"Knud");
	
		assertEquals("Knud", p.getName());
		assertEquals(1, p.account.getSum());
		
		p.setName("Brian");
		assertEquals("Brian", p.getName());
		
		p.account.setSum(0);
		assertEquals(0, p.account.getSum());
		
		p.account.setSum(100);
		p.account.addSum(200);
		assertEquals(300, p.account.getSum());
		
		
		assertEquals(p.account, p.getAccount());
		
		
	}

}
