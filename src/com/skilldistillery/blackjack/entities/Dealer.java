package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {

	private Deck deck = new Deck();

	public Dealer(Hand hand) {
		super(hand);
	}

	public void shuffle() {
		deck.shuffle();
	}

	public Card dealCard() {
		return deck.dealCard();

	}

	public boolean willDealerHit(BlackjackHand dealer) {
		if (dealer.getHandValue() <17) {
			return true;
			// in the app if willDealerHit == true dealer.addCard(dealer.dealCard);
		}else 
			return false;
	}
	

//	public void bolean hit()
//	
//	public void hit
//	if value < 17
//	
//	public void stand 
//	if value > 18
//	
//	public void bust
//	if value >21

}
