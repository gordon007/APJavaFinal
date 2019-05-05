import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void testCard() {
		Card test1 = new Card("queen","spade",12);
		assertNotNull(test1);
	}

	@Test
	void testGetRank() {
		Card test1 = new Card("queen","spade",12);
		assertEquals("queen",test1.getRank());
	}

	@Test
	void testGetSuit() {
		Card test1 = new Card("queen","spade",12);
		assertEquals("spade",test1.getSuit());
		}

	@Test
	void testGetValue() {
		Card test1 = new Card("queen","spade",12);
		assertEquals(12,test1.getValue());
	}

	@Test
	void testEqualsCard() {
		Card test1 = new Card("queen","spade",12);
		Card test2 = new Card("queen","spade",12);
		Card test3 = new Card("jack","spade",11);
		assertTrue(test1.equals(test2));
		assertFalse(test1.equals(test3));
	}

	@Test
	void testToString() {
		Card test1 = new Card("queen","spade",12);
		assertEquals("queen of spade (point value = 12)",test1.toString());
	}

}
