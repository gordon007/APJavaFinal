import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testDeck() {
		//tests parameterized constructor
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"spade", "club" , "heart", "diamond"};
		int[] values = {11,12,13};
		Deck test1 = new Deck(ranks,suits,values);
		assertNotNull(test1);
		
		//tests failsafe
		String[] ranks2 = {"jack", "queen"};
		Deck test2 = new Deck(ranks2,suits,values);
		assertNotNull(test2);
		
		//tests default deck
		Deck test3 = new Deck(true);
		assertNotNull(test3);
		
		//tests empty deck
		Deck test4 = new Deck(false);
		assertNotNull(test4);
		assertEquals(true,test4.isEmpty());
	}

	@Test
	void testIsEmpty() {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"spade", "club" , "heart", "diamond"};
		int[] values = {11,12,13};
		Deck test1 = new Deck(ranks,suits,values);
		assertEquals(false,test1.isEmpty());
		
		
		for(int i = 0; i < 12; i++)
		{
			test1.deal();
		}
		assertEquals(true,test1.isEmpty());
	}

	@Test
	void testSize() {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"spade", "club" , "heart", "diamond"};
		int[] values = {11,12,13};
		Deck test1 = new Deck(ranks,suits,values);
		assertEquals(12,test1.size());
	}

	@Test
	void testDeal() {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"spade", "club" , "heart", "diamond"};
		int[] values = {11,12,13};
		Deck test1 = new Deck(ranks,suits,values);
		for(int i = 0; i < 12; i++)
		{
			assertNotNull(test1.deal());
	
		}
		assertNull(test1.deal());
	}
	
	@Test
	void testShuffle() {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"spade", "club" , "heart", "diamond"};
		int[] values = {11,12,13};
		Deck test1 = new Deck(ranks,suits,values);
		for(int i = 0; i < 12; i++)
		{
			test1.deal();
		}
		assertNull(test1.deal());
	}
	
}
