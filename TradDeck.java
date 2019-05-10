import java.util.ArrayList;

import javax.swing.ImageIcon;

public class TradDeck extends Deck 
{
	//holds cards that were present at deck creation
	ArrayList<Card> orgCards = new ArrayList<Card>();

	public TradDeck()
	{
		String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits = {"hearts", "spades", "clubs", "diamonds"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		
		//generates deck
		for(int i = 0; i < suits.length; i++)
		{
			for(int j = 0; j < ranks.length; j++)
			{
				String imageLoc = values[j] + suits[i] + ".GIF";
				cards.add(new Card(ranks[j],suits[i],values[j],new ImageIcon(imageLoc).getImage()));
			}
		}
		
		//builds orgCards
		for(int i = 0; i < cards.size(); i++)
		{
			orgCards.add(cards.get(i));
		}
		
		
	}
	
	//resets the deck to original state
	@Override
	public void reset()
	{
		cards.clear();
		for(int i = 0; i < orgCards.size(); i++)
		{
			cards.add(orgCards.get(i));
		}
	}
	
}
