import java.util.ArrayList;
public class Deck {

	//holds current cards
	ArrayList<Card> cards = new ArrayList<Card>();
	//holds cards that were present at deck creation
	ArrayList<Card> orgCards = new ArrayList<Card>();
	
	//Constructor to build standard 52 card deck, and others
	public Deck(String[] ranks, String[]suits, int[] values)
	{
		//failsafe
		boolean rankLessThanValue = false;
		if(ranks.length < values.length)
			rankLessThanValue = true;
		
		//generates deck
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
		
		//builds orgCards
		for(int i = 0; i < cards.size(); i++)
		{
			orgCards.add(cards.get(i));
		}
	}

	//Builds either standard or blank deck, depending on parameter
	public Deck(boolean buildStandard)
	{
		if(buildStandard)
		{
			String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
			String[] suits = {"heart", "spade", "club", "diamond"};
			int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
			
			//generates deck
			for(int i = 0; i < suits.length; i++)
			{
				for(int j = 0; j < ranks.length; j++)
				{
					cards.add(new Card(ranks[j],suits[i],values[j]));
				}
			}
			
			//builds orgCards
			for(int i = 0; i < cards.size(); i++)
			{
				orgCards.add(cards.get(i));
			}
		}
		
	}
	
	//returns true if no cards left
	public boolean isEmpty()
	{
		if(cards.size() == 0)
			return true;
		return false;
	}
	
	//returns number of cards present
	public int size()
	{
		return cards.size();
	}
	
	//takes the first card from the deck, returns it
	public Card deal()
	{
		if(isEmpty())
			return null;
		
		return cards.remove(0);
	}
	
	//shuffles cards present
	public void shuffle()
	{	
		for(int i = size()-1; i > 0; i--)
		{
			int r = (int) (Math.random() * i);
			Card mm = cards.get(i);
			cards.set(i,cards.get(r));
			cards.set(r, mm);
		}
	}
	
	//resets the deck to original state
	public void reset()
	{
		cards.clear();
		for(int i = 0; i < orgCards.size(); i++)
		{
			cards.add(orgCards.get(i));
		}
	}
	
}
