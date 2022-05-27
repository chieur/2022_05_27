package ca.sheridancollege.week2.softwarefundamentals;

/**
	a class to model Card objects .
	created in Week 2 for the cloning repository demo
	@author dancye , 2019
*/
public class Card{
	private String suit;// spades , hearts , clubs , diamonds
	private int value;// 1 - 13

	/**
		a constructor that creates a Card object with a given suit and a given value
		@param givenSuit
		@param givenValue
	*/
	public Card(String givenSuit,int givenValue){
		suit=givenSuit;
		value=givenValue;
	}

	/**
		@return the suit
	*/
	public String getSuit(){
		return suit;
	}

	/**
		@param suit the suit to set
	*/
	public void setSuit(String suit){
		if(suit.equals("Hearts")||suit.equals("Diamonds")||suit.equals("Clubs")||suit.equals("Spades")){
			this.suit=suit;
		}else{
			System.out.println("the suit you tried to assign is invalid");
			System.out.println("choose from: Spades , Hearts , Clubs , Diamonds");
		}
	}

	/**
		@return the value
	*/
	public int getValue(){
		return value;
	}

	/**
		@param value the value to set
	*/
	public void setValue(int value){
		if(value<1||value>13){
			System.out.println("the value of the card must be between 1 - 13");
		}else{
			this.value=value;
		}
	}
}