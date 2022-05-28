package card;

/**
	a class to model card objects
	@author chieur
*/
public class card{
	public enum suit{
		spade
		,heart
		,club
		,diamond
	}

	private suit suit;
	private int value;// 1 - 13

	/**
		@return the suit
	*/
	public suit get_suit(){
		return suit;
	}

	/**
		@param suit the suit to set
	*/
	public void set_suit(suit suit){
		this.suit=suit;
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
	public void set_value(int value){
		if(value<1||value>13){
			System.out.println("the value of the card must be between 1 - 13");
		}else{
			this.value=value;
		}
	}

	/**
		constructor
		@param suit
		@param value
	*/
	public card(suit suit,int value){
		set_suit(suit);
		set_value(value);
	}
}