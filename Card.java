import java.awt.Image;

public class Card 
{

	String rank;
	String suit;
	int value;
	Image face;
	
	public Card(String _rank, String _suit, int _value, Image _face)
	{
		rank = _rank;
		suit = _suit;
		value = _value;
		face = _face;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public boolean equals(Card other)
	{
		if(rank != other.getRank())
			return false;
		if(suit != other.getSuit())
			return false;
		if(value != other.getValue())
			return false;
		return true;
	}
	
	public String toString()
	{
		return rank + " of " + suit + " (point value = " + value + ")";
	}
	
	public Image getFace()
	{
		return face;
	}
}
