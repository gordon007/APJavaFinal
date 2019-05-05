import java.util.ArrayList;

public class Deck {

	ArrayList<Card> cards = new ArrayList<Card>();
	ArrayList<Card> discards = new ArrayList<Card>();
	
	public Deck(String[] ranks, String[]suits, int[] values)
	{
		boolean rankLessThanValue = false;
		if(ranks.length < values.length)
			rankLessThanValue = true;
		
		for(int i = 0; i < suits.length; i++)
		{
			if(rankLessThanValue)
			{
				for(int j = 0; j < ranks.length; j++)
				{
					cards.add(new Card(ranks[j],suits[i],values[j]));
				}
			}
			else
			{
				for(int j = 0; j < values.length; j++)
				{
					cards.add(new Card(ranks[j],suits[i],values[j]));
				}
			}
		}
	}
	
	public boolean isEmpty()
	{
		if(cards.size() == 0)
			return true;
		return false;
	}
	
	public int size()
	{
		return cards.size();
	}
	
	public Card deal()
	{
		if(isEmpty())
			return null;
		
		Card grab = cards.get(0);
		cards.remove(0);
		discards.add(grab);
		return grab;
	}
	
	public void shuffle()
	{
		while(discards.size() != 0)
		{
			cards.add(discards.remove(0));
		}
		
		for(int i = size()-1; i > 0; i--)
		{
			int r = (int) (Math.random() * i);
			Card mm = cards.get(i);
			cards.set(i,cards.get(r));
			cards.set(r, mm);
		}
	}
	
}
