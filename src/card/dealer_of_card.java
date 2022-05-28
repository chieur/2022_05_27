package card;

/**
	class which creates cards
	@author chieur 991625137
*/
public class dealer_of_card{
	public static void main(String[]args){
		card spade_1=new card(card.suit.spade,1);
		spade_1.set_suit(card.suit.heart);
	}
}