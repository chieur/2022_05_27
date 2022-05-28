package ca.sheridancollege.week2.softwarefundamentals;

/**
	a class to model Card objects
	@author chieur
*/
public class Card{
	public enum enum_suit{
		spade
		,heart
		,club
		,diamond
	}

	private enum_suit suit;
	private int value;// 1 - 13

	/**
		constructor with arguments suit & value
		@param suit
		@param value
	*/
	public Card(enum_suit suit,int value){
		set_suit(suit);
		set_value(value);
	}

	/**
		@return the suit
	*/
	public enum_suit get_suit(){
		return suit;
	}

	/**
		@param suit the suit to set
	*/
	public void set_suit(enum parameter_suit){
		suit=parameter_suit;
	}

	/**
		@return the value
	*/
	public int get_value(){
		return value;
	}

	/**
		@param value the value to set
	*/
	public void set_value(int parameter_value){
		if(value<1||value>13){
			System.out.println("the value of the card must be between 1 - 13");
		}else{
			value=parameter_value;
		}
	}
}