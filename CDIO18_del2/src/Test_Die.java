import static org.junit.Assert.*;

public class Test_Die {

	@org.junit.Test
	public void dieTest() {

		Die die1 = new Die();

		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;

		for(int i = 0; i <= 10000; i++)
		{

			switch (die1.roll())
			{


			case 1:
				c1++;
				break;

			case 2:
				c2++;
				break;

			case 3:
				c3++;
				break;

			case 4:
				c4++;
				break;

			case 5:
				c5++;
				break;

			case 6:
				c6++;
				break;


			}

		}

		System.out.println("count of 1 eyes: " +c1);
		System.out.println("count of 2 eyes: " +c2);
		System.out.println("count of 3 eyes: " +c3);
		System.out.println("count of 4 eyes: " +c4);
		System.out.println("count of 5 eyes: " +c5);
		System.out.println("count of 6 eyes: " +c6);

		int test = die1.roll();
		boolean x = false;

		if(test >= 1 && test <= 6)
		{
			x = true;
		}

		assertEquals(x, true);
		assertEquals(c1, 1666, 166);
		assertEquals(c2, 1666, 166);
		assertEquals(c3, 1666, 166);
		assertEquals(c4, 1666, 166);
		assertEquals(c5, 1666, 166);
		assertEquals(c6, 1666, 166);
	}

}
