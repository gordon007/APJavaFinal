import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class Deck {

	//holds current cards
	ArrayList<Card> cards = new ArrayList<Card>();
	Image back = new ImageIcon("back1.GIF").getImage();
	
	public Deck()
	{
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
	public abstract void reset();
	
}
