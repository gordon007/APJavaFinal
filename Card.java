
public class Card 
{

	String rank;
	String suit;
	int value;
	
	public Card(String _rank, String _suit, int _value )
	{
		rank = _rank;
		suit = _suit;
		value = _value;
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
}
