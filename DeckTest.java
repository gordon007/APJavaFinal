import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testDeck() {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"spade", "club" , "heart", "diamond"};
		int[] values = {11,12,13};
		Deck test1 = new Deck(ranks,suits,values);
		assertNotNull(test1);
		
		String[] ranks2 = {"jack", "queen"};
		Deck test2 = new Deck(ranks2,suits,values);
		assertNotNull(test2);
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
		test1.shuffle();
		assertEquals(0,test1.discards.size());
		assertNotNull(test1.deal());
	}
	
}
