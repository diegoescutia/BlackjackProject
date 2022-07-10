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
		if (dealer.getHandValue() < 18) {
			return true;
		}else 
			return false;
	}

}
